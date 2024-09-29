package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String markspage() {
		return "student";
	}
	@RequestMapping("/req1")
	public String studentpage(@RequestParam String sNo,@RequestParam String  sName,@RequestParam String  course,@RequestParam int  hibernate,@RequestParam int spring,@RequestParam int springboot,ModelMap model) {
		model.put("rollno", sNo);
		model.put("sname", sName);
		model.put("course", course);
		model.put("hibernate", hibernate);
		model.put("spring", spring);
		model.put("springboot", springboot);
		
		double totalmarks=hibernate+spring+springboot;
	double avgmarks=totalmarks%3;
	double percantage=avgmarks*100;
		String message=null;
		
		if(percantage>=70) {
			message="A grade";
		}
		
		else if(percantage>=60) {
			message="B grade";
		}
		
		else if (percantage>=50){
			message="C grade";
		}
		String result=null;
		if(hibernate>=35&&spring>=35&&springboot>=35) {
			result="pass";
		}
		else {
			result="fail";
		}
		
		
		model.put("totalmarks", totalmarks);
		model.put("percantage", percantage);
		model.put("Grade", message);
		model.put("Result", result);
		
		return "result";
	}
}
