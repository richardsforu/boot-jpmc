package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

@SpringBootApplication
public class BootJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext ac=SpringApplication.run(BootJdbcApplication.class, args);
	
	Product prod=new Product();
	prod.setId("P099");
	prod.setName("Dell Laptop");
	prod.setPrice(12000);
	
	//ProductDaoImpl dao= ac.getBean(ProductDaoImpl.class);
	ProductService ps=ac.getBean(ProductService.class);
	//ps.persistProduct(prod);
	
	for(Product p:ps.listProducts()) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println("----------------");
	}
	
	System.out.println("---- Done ---");
	
	}

}
