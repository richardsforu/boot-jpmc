package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, String>{
	
	
	//@Query(value="select p.id,p.name,p.price from Product p where p.name like ?")
	// Find Product By Name
	public List<Product> findProductByNameLike(String name);
	
	// find Product By Price
	public List<Product> findProductByPriceEquals(double price);
	
	// Update Product by Id
	
	@Query(value="delete from Product p where p.id like :id")
	public void updateProductByIdEquals(String id);
}
