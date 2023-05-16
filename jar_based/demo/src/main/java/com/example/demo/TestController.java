package com.example.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

	@Value("${spring.profiles.active}")
	private String currentProfile;

	@Value("${project.vendor.name}")
	private String vendorName;

	@GetMapping(value ="/test")
	public Map<String, Object> test() {
		System.out.println("TestController.test() : incoming request : @ " + new Date());
		Map<String, Object> map = new HashMap<>();

		map.put("now", new Date().toString());
		map.put("currentProfile", currentProfile);
		map.put("VendorName", vendorName);

		return map;
	}
}
