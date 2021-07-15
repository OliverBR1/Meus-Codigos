package com.brq.camel.covid;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GoRestRouter extends RouteBuilder{

	@Override
	public void configure( ) throws Exception{
		
		from("timer:covid?period=10000")
		.to("https://gorest.co.in/public/v1/users")
		.process(new GoRestProcess() )
		.log("${body}");
	}
}
