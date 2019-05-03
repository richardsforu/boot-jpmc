package com.cts.product.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@GetMapping()
	public String f1() {
		return "Welcome to my APP- GET Mapping";
	}
	
	@PostMapping()
	public String f2() {
		return "Welcome to my APP- POST Mapping";
	}
	
	@PutMapping()
	public String f3() {
		return "Welcome to my APP- PUT Mapping";
	}
	
	@DeleteMapping()
	public String f4() {
		return "Welcome to my APP- DELETE Mapping";
	}
	
	@DeleteMapping("/{myId}")
	public String f5(@PathVariable("myId")String id) {
		return "Welcome to my APP- DELETE-1 Mapping  with id: "+id;
	}
	

}
