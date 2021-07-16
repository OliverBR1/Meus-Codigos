package com.brq.camel.gorest;

import lombok.Data;

@Data
public class PaginationGoRestModel {

	private int total;
 	private int pages;
 	private int page;
 	private int limit;
 	
 	private LinkGoRestModel links;
}
