package com.lt.ecommerce.service;

import com.lt.ecommerce.model.Order;
import com.lt.ecommerce.repository.OrderRepository;

public class OrderService {
    private static final OrderRepository orderRepository = new OrderRepository();

    public void createOrder() {
        Order order = new Order();
        order.setId(1001);
        order.setCustomerId(2001);
        order.setProductId(3001);
        order.setPrice(122.3f);
        order.setQty(3);
        order.setTax(15);
        order.setFinalAmount(525);
        orderRepository.createOrder(order);
    }


}
