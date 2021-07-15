package com.brq.camel.covid;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.brq.camel.models.ResponseGoRestModel;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GoRestProcess implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception{
		String input = exchange.getIn().getBody(String.class);
		System.out.println("GoRest" + input);
		
		ObjectMapper objectMapper = new ObjectMapper();
		ResponseGoRestModel responseGoRestModel= objectMapper.readValue(input, ResponseGoRestModel.class);
		
		System.out.println(responseGoRestModel.toString());
		
	}

}
