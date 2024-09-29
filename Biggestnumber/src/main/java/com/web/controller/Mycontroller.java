package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String numberpage() {
		return "number";
	}
	@RequestMapping("/req1")
	public String Bignumberpage(@RequestParam int fnumber,@RequestParam int snumber,@RequestParam int tnumber,ModelMap model) {
		model.put("fno", fnumber);
		model.put("sno", snumber);
		model.put("tno", tnumber);
		String message=null;
		
		if(fnumber>snumber&&fnumber>tnumber) {
			message="firstnumber is bigger";	
		}
		
		else if(snumber>fnumber&&snumber>tnumber) {
			message="second number is bigger";	
		}
		
		else if (tnumber>fnumber&&tnumber>snumber){
			message="third number is bigger";	
		}
		model.put("message", message);
		
		return "result";
	}
}
