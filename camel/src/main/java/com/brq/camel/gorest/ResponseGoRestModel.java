package com.brq.camel.gorest;


import java.util.ArrayList;

import lombok.Data;

@Data
public class ResponseGoRestModel {
	
	private ArrayList<GoRestModel>data;
	
	private GoRestMetaModel meta;
	

}
