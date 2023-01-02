package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FireController {

	@GetMapping("/")
	public String anu() {
		return "Hello World";
	}
}
