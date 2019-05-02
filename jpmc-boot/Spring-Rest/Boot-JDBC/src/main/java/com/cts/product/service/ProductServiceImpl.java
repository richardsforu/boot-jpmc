package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;
	
	@Override
	public void persistProduct(Product prod) {
		dao.saveProduct(prod);
	}
	
	@Override
	public List<Product> listProducts(){
		return dao.findAll();
	}

}
