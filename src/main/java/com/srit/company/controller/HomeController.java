package com.srit.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHome(Model model) {
		System.out.println("returning home page");
		return "home";
	}
	
	@RequestMapping("/login")
	public String userLogin(Model model) {
		System.out.println("user Register Sucessfully.");
		return "login";
	}

}
