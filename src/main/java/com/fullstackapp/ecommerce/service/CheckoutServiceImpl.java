package com.fullstackapp.ecommerce.service;

import com.fullstackapp.ecommerce.dao.CustomerRepository;
import com.fullstackapp.ecommerce.dto.Purchase;
import com.fullstackapp.ecommerce.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
