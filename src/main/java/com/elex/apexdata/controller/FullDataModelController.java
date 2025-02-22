package com.elex.apexdata.controller;

import java.io.IOException;
import java.net.URI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elex.apexdata.models.FullDataModel;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class FullDataModelController {

	private ObjectMapper mapper = new ObjectMapper();
	
	public FullDataModel loadFullDataOverstat(URI uri) {
		FullDataModel data = null;
		try {
			data = mapper.readValue(uri.toURL(), FullDataModel.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	@GetMapping
	public String test() {
		return "hello world";
	}
}
