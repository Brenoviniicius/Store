package com.apirest.storeapi.services;


import com.apirest.storeapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}
