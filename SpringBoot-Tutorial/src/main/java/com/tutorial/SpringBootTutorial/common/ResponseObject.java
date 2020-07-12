package com.tutorial.SpringBootTutorial.common;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class ResponseObject {
	
	private  HashMap<String,Object> data = new HashMap<>();
	
	public void addData(String key , Object value) {
		data.put(key, value);
	}

	public HashMap<String, Object> getData() {
		return data;
	}

}
