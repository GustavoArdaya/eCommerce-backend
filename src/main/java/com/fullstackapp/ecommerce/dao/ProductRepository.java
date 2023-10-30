package com.fullstackapp.ecommerce.dao;

import com.fullstackapp.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
