package com.brq.camel.gorest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoRestModel {

	private int id;
	private String name;
	private String email;
	private String gender;
	private String status;
}
