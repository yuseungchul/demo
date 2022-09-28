package com.example.demo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class MainController {

	@GetMapping("/")
	public String mainPage() {
		
		
		return "main/main";
	}
}
