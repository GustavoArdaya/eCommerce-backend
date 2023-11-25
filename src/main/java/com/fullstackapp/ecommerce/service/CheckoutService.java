package com.fullstackapp.ecommerce.service;

import com.fullstackapp.ecommerce.dto.Purchase;
import com.fullstackapp.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
