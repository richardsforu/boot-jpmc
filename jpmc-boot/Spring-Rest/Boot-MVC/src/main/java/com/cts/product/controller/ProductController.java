package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	
	@RequestMapping("/")
	public String f1() {
		return "index";
	}
	
	@RequestMapping("/s1")
	public void f2() {
		System.out.println("--- f2 method of ProductCOmntrller");
	}

}
