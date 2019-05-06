package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@RequestMapping("api/product")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductDao dao;

	@PostMapping
	public void saveProduct(@RequestBody Product product) {
		dao.save(product);
	}

	@GetMapping()
	public List<Product> listAll() {
		return dao.findAll();
	}

	@GetMapping("/{id}")
	public Product findProduct(@PathVariable("id") String id) {
		return dao.findById(id).orElse(null);
	}

	@GetMapping("byName/{name}")
	public List<Product> findByName(@PathVariable("name") String name) {
		return dao.findProductByNameLike(name);

	}

	@GetMapping("byPrice/{price}")
	public List<Product> findByName(@PathVariable("price") double price) {
		return dao.findProductByPriceEquals(price);
	}

	@PutMapping("/update/{id}")
	public void updateProductById(@PathVariable("id") String id) {
		dao.updateProductByIdEquals(id);
	}

	@PutMapping
	public void updateProduct(@RequestBody Product product) {
		dao.save(product);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") String id) {
		dao.deleteById(id);
	}

	@DeleteMapping
	public void deleteProduct(@RequestBody Product product) {
		dao.delete(product);
	}

}
