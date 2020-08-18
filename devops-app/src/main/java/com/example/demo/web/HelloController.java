package com.example.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/api/hello")
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.status(HttpStatus.OK).body("hello devops");
	}

}
