package com.brq.camel.gorest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkGoRestModel {

	private String previous;
	private String current;
	private String next;
}