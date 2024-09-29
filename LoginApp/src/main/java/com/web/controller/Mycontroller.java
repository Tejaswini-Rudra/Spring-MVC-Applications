package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String loginpage() {
		return "login";
	}
	@RequestMapping("/req1")
	public String studentpage(@RequestParam String username,@RequestParam String  password ,ModelMap model) {
		model.put("username", username);
		model.put("password", password);
		
		
		String message=null;
		
		if(username.equals("teju")&&password.equals("teju1234")) {
			message="login sucess";
		}
		
		else  {
			message="login fail";
		}
		
		
		
		
		model.put("Result", message);
		
		return "result";
	}
}
