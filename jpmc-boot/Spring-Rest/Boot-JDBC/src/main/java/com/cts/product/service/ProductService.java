package com.cts.product.service;

import java.util.List;

import com.cts.product.model.Product;

public interface ProductService {

	void persistProduct(Product prod);

	List<Product> listProducts();

}