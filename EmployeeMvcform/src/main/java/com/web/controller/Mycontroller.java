package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.Employee.Employee;
@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String employeeform(ModelMap model) {
		Employee employee=new Employee();
		model.put("employee", employee);
		return "employee";	
	}
	@RequestMapping("/employee")
	public String forDetails(@ModelAttribute Employee employee,ModelMap model) {
		double ta=0.0,hra=0.0,da=0.0,pf=0.0;
		if(employee.getSalary()<30000) {
			ta=employee.getSalary()+0.07;
			da=employee.getSalary()+0.09;
			hra=employee.getSalary()+0.11;
			pf=employee.getSalary()+0.15;
				}
		else if(employee.getSalary()>=30000&&employee.getSalary()<50000) {
			ta=employee.getSalary()+0.12;
			da=employee.getSalary()+0.13;
			hra=employee.getSalary()+0.17;
			pf=employee.getSalary()+0.22;
		}
		else {
			ta=employee.getSalary()+0.17;
			da=employee.getSalary()+0.19;
			hra=employee.getSalary()+0.21;
			pf=employee.getSalary()+0.25;
		}
		double netsalary=0.0,grasssalary=0.0;
		grasssalary=employee.getSalary()+ta+da+hra;
		netsalary=grasssalary-pf;
		employee.setTa(ta);
		employee.setDa(da);
		employee.setHra(hra);
		employee.setPf(pf);
		employee.setGrasssalary(grasssalary);
		employee.setNetsalary(netsalary);
		model.put("employee",employee);
		
		return "result";
	}
	

}
