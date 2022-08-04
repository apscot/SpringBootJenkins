package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerClass {

	@GetMapping("Hello")
	public String getValue() {
		return "Hello World!";
	}
	@GetMapping("HelloJenkins")
	public String getValueJenkins() {
		return "Hello Jenkins";
	}
}
