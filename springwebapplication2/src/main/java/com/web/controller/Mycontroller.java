package com.web.controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Mycontroller {
	@RequestMapping("/")
	
	public String indexpage() {
		return "index";
	}

}
