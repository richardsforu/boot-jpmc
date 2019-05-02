package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@SpringBootApplication
public class BootDataJpaApplication {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(BootDataJpaApplication.class, args);
	
	Product prod=new Product();
	prod.setId("P003");
	prod.setName("Mouse");
	prod.setPrice(250);
	
	ProductDao dao= ac.getBean(ProductDao.class);
	//dao.save(prod);
	/*for(Product p:dao.findAll()) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println("---------------");
	}
	*/
	
	// find one object
	
	Product p=dao.findById("P000002").orElse(null);
	if(p!=null) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println("---------------");
	}else {
		System.out.println("--- Id Dos not found");
	}
	
	
	}

}
