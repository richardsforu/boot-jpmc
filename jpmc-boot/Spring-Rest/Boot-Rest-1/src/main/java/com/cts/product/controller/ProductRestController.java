package com.cts.product.controller;

import java.net.Authenticator.RequestorType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.model.Product;

import ch.qos.logback.classic.spi.STEUtil;

@RestController
@RequestMapping("api/product")
public class ProductRestController {

	Product prod = null;
	List<Product> prods = new ArrayList<Product>();

	@GetMapping()
	public List<Product> listAll() {
		Product p1 = new Product("P01", "Pen", 3434);
		Product p2 = new Product("P02", "B0ok", 8434);
		Product p3 = new Product("P03", "Len", 2434);
		Product p4 = new Product("P04", "Fen", 6434);
		Product p5 = new Product("P05", "Den", 4434);
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);

		return prods;
	}

	
	@GetMapping("/{id}")
	public Product findProduct(@PathVariable("id") String id) {
		boolean flag=false;
		Product p=null;
		for(Product prod:prods) {
			
			if(prod.getId().equals(id)) {
				p=prod;
				flag=true;
				break;
			}
		}
		
		return p;
	}
	
	//@PostMapping("/{pid}")
	//public void findProduct(@PathVariable("pid") String id) {
	//	System.out.println("--- Received id: " + id);
	//}

	@PostMapping()
	public Product saveProduct(@RequestBody Product prod) {
		this.prod = prod;
		System.out.println(prod.getId());
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		return prod;

	}

}
