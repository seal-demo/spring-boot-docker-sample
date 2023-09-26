package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "<div style='display: flex; align-items: center; justify-content: center; height: 100vh;'><div style='text-align: center; font-weight: bold; font-size: 48px;'>Greetings from Walrus&Appilot! TADA!</div></div>";
	}
}
