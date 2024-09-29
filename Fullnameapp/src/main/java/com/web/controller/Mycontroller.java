package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String fullname() {
		return "name";
	}
	@RequestMapping("/req1")
	public String fullnamepage(@RequestParam String fname,@RequestParam String lname,ModelMap model) {
		model.put("key1", fname);
		model.put("key2", lname);
		String fullname=fname+" "+lname;
		model.put("fullname", fullname);
		return "result";
	}
}
