package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

	@GetMapping(value ="/test")
	public String test() {
		return (new Date() + " , hello");
	}
}
