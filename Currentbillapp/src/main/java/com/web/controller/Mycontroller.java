package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String numberpage() {
		return "bill";
	}
	@RequestMapping("/req1")
	public String Bignumberpage(@RequestParam String cId,@RequestParam String  cName,@RequestParam int cReading,@RequestParam int pReading,ModelMap model) {
		model.put("cid", cId);
		model.put("cname", cName);
		model.put("creading", cReading);
		model.put("preading", pReading);
		double unit=cReading-pReading;
		
		double totalbill=0.0;
		if(unit<300) {
			totalbill=unit*1.75;
		}
		
		else if(unit>=300&&unit<500) {
			totalbill=unit*3.25;
		}
		
		else if (unit>=500){
			totalbill=unit*7.25;
		}
		model.put("units", unit);
		model.put("tbill", totalbill);
		
		return "result";
	}
}
