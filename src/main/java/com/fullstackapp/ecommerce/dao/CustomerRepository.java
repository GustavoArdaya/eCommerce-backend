package com.fullstackapp.ecommerce.dao;

import com.fullstackapp.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
