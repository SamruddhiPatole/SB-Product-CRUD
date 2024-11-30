package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Product;

public  interface ProductRepository extends JpaRepository<Product, Integer> {

}
