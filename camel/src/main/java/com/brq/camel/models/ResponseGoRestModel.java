package com.brq.camel.models;


import java.util.ArrayList;

import lombok.Data;

@Data
public class ResponseGoRestModel {
	
	private ArrayList<GoRestModel>data;
	
	private GoRestMetaModel meta;
	

}
