package com.app.jenkins3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/greet")
	public String greet() {
		return "hello world ..";
	}
}
