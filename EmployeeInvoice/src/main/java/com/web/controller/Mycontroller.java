package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String billpage() {
		return "employeebill";
	}
	@RequestMapping("/req1")
	public String employeebillpage(@RequestParam String eId,@RequestParam String  eName,@RequestParam double esalary,ModelMap model) {
		model.put("eid", eId);
		model.put("ename", eName);
		model.put("esalary", esalary);
		
		
		double TA=0.0;
		double HRA=0.0;
		double DA=0.0;
		double PF=0.0;
		if(esalary<2500) {
			TA=esalary*0.07;
			DA=esalary*0.09;
			HRA=esalary*0.11;
			PF=esalary*0.15;
			
		}
		
		else if(esalary>=3000&&esalary<50000) {
			TA=esalary*0.12;
			DA=esalary*0.13;
			HRA=esalary*0.17;
			PF=esalary*0.22;
			
		}
		
		else if (esalary>=50000){
			TA=esalary*0.17;
			DA=esalary*0.19;
			HRA=esalary*0.21;
			PF=esalary*0.25;
			
		}
		
		model.put("ta", TA);
		model.put("hra", HRA);
		model.put("da", DA);
		model.put("pf", PF);
		double nsalary=esalary+TA+DA+HRA;
		double  gsalary=nsalary-PF;
		model.put("gsalary", gsalary);
		model.put("nsalary",nsalary);
		
		return "result";
	}
}
