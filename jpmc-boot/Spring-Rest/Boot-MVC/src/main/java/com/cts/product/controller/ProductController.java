package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	
	//  Get data
	@RequestMapping( "/")
	public String f1() {
		return "index";
	}
	
	// save
	@RequestMapping("/")
	public void f2() {
		System.out.println("--- f2 method of ProductCOmntrller");
	}

}
