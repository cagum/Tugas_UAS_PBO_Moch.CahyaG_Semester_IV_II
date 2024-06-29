package com.cagum.mystorage.services;

import com.cagum.mystorage.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
