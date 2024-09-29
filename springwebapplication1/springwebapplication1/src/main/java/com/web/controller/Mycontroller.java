package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
	@RequestMapping("/req1")
	@ResponseBody
	public String indexpage() {
		return "<h1>this is springBoot application</h1>";
	}

}
