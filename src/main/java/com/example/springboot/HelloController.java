package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "<div style='text-align: center; font-weight: bold; font-size: 24px;'>Greetings from Beijing! TADA!</div>";
	}
}
