package com.cjc.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Product;
import com.cjc.service.ProductService;

@RestController
public class ProductController {
      
	private ProductService service;
     
	public ProductController(ProductService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(value = "/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		Product prod=service.saveProduct(product);
		return prod;
	}
	
	@GetMapping(value = "/getProducts")
	public List<Product> getAllProducts()
	{
		List<Product> plist=service.getAllProducts();
		return plist;
	}
	
	@GetMapping(value = "/getProduct/{id}")
	public Product getProduct(@PathVariable int id)
	{
		Product product=service.getProduct(id);
		return product;
	}
	
	@DeleteMapping(value = "/deleteProduct/{id}")
	public List<Product>deleteProduct(@PathVariable int id)
	{
		List<Product> plist=service.deleteProduct(id);
		return plist;
	}
	
	@PutMapping(value = "/updateProduct")
	public Product updateProduct(@RequestBody Product product)
	{
	    Product  pd = service.saveProduct(product);
		return pd;
	}
	
}
