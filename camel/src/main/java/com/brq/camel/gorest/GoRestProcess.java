package com.brq.camel.gorest;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoRestProcess implements Processor {
    
	private static final Logger LOGGER = LoggerFactory.getLogger(GoRestProcess.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		String input = exchange.getIn().getBody(String.class);
		System.out.println("GoRestProcessor " + input);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		ResponseGoRestModel responseGoRestModel = objectMapper.readValue(input, ResponseGoRestModel.class);
		log.info(responseGoRestModel.toString());
		LOGGER.info(responseGoRestModel.toString());
		
		RestTemplate restTemplate = new RestTemplate();
		
		ArrayList<GoRestModel> arrayUsuario = responseGoRestModel.getData();
						
		for (GoRestModel usuario : arrayUsuario) {
			HttpEntity<GoRestModel> request = new HttpEntity<GoRestModel>(usuario);
			restTemplate.postForObject("http://localhost:8080/usuarios", request, GoRestModel.class);	
		}
		
//		LinksGoRestModel linksGoRestModel = new LinksGoRestModel();
//		linksGoRestModel.setNext("Uma String");
//		linksGoRestModel.setPrevious("Outra String");
//		
//		LinksGoRestModel linksGoRestModel1= LinksGoRestModel
//				.builder()
//				.next("Uma String")
//				.previous("Outra String")
//				.build();
		
	}

}