package com.fullstackapp.ecommerce.dto;

import com.fullstackapp.ecommerce.entity.Address;
import com.fullstackapp.ecommerce.entity.Customer;
import com.fullstackapp.ecommerce.entity.Order;
import com.fullstackapp.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
