package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String billpage() {
		return "productbill";
	}
	@RequestMapping("/req1")
	public String productbillpage(@RequestParam String cId,@RequestParam String  cName,@RequestParam long mnumber,@RequestParam String  pname,@RequestParam double price,@RequestParam int quantity,ModelMap model) {
		model.put("cid", cId);
		model.put("cname", cName);
		model.put("mno", mnumber);
		model.put("pname", pname);
		model.put("price", price);
		model.put("quantity", quantity);
		
		double discountAmt=0.0;
	
		double totalbill=price*quantity;
		if(totalbill<2500) {
			discountAmt=totalbill*0.1;
		}
		
		else if(totalbill>=2500&&totalbill<5000) {
			discountAmt=totalbill*0.15;
		}
		
		else if (totalbill>=5000){
			discountAmt=totalbill*0.30;
		}
		double Total=totalbill-discountAmt;
		double gst=Total*0.18;
		double InvoiceBill=Total+gst;
		model.put("discountAmt", discountAmt);
		model.put("gst", gst);
		model.put("totalbill", totalbill);
		model.put("invoicebill", InvoiceBill);
		
		return "result";
	}
}
