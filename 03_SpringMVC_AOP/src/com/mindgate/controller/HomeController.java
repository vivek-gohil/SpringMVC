package com.mindgate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	public HomeController() {
		System.out.println("Home Controller Object Is Created !!");
	}

	@RequestMapping("/")
	public String showWelcomePage() {
		System.out.println("In showWelcomePage");
		return "homePage";
	}
}
