package com.cjc.service;

import java.util.List;

import com.cjc.model.Product;

public interface ProductService {

	Product saveProduct(Product product);

	List<Product> getAllProducts();

	Product getProduct(int id);

	List<Product> deleteProduct(int id);

}
