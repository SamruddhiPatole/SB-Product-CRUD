package com.cjc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mapping.model.IdPropertyIdentifierAccessor;
import org.springframework.stereotype.Service;

import com.cjc.model.Product;
import com.cjc.repository.ProductRepository;
import com.cjc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Product saveProduct(Product product) {
		repository.save(product);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = repository.findAll();
		return list;
	}

	@Override
	public Product getProduct(int id) {
		Optional<Product> optional = repository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Product> deleteProduct(int id) {
       repository.deleteById(id);
		return getAllProducts();
	}
}
