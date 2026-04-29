package com.Diego.product_api.repository;

import com.Diego.product_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}