package com.example.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestExample {

	@GetMapping(value = "/hello")
	public Object hello() {
		Map<String, Object> sM = new HashMap<String, Object>();
		sM.put("hello", "kaun");
		sM.put("date" ,new Date());
		
		return sM; 
	}
}
