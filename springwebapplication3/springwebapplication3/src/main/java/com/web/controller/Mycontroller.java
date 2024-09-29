package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String homepage() {
		return"home";
	}
	@RequestMapping("/contact")
public String  contactpage() {
		
		return "contact";
	}
	@RequestMapping("/about")
	public String aboutpage() {
		return "about";
	}
	@RequestMapping("/login")
	public String loginpage() {
		return "login";
	}
	@RequestMapping("/registration")
	public String  registrationpage() {
		return "reg";
	}
}
