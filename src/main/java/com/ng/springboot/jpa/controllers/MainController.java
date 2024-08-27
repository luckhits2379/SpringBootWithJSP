package com.ng.springboot.jpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		
		return "home";
	}
	

	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
}
