package com.mjkim.project.simpleweb.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
}
