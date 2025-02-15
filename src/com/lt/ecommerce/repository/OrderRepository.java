package com.lt.ecommerce.repository;
import com.lt.ecommerce.model.Order;
import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    private static final Map<Integer, Order> orderMap = new HashMap<Integer, Order>();

    public void createOrder(Order order) {
        orderMap.put(order.getId(), order);
    }

    public Order getOrder(int orderId) {
        return orderMap.get(orderId);
    }

    public Map<Integer, Order> getAllOrder() {
        return orderMap;
    }

    public void deleteOrder(int orderId) {
        orderMap.remove(orderId);
    }

    public void deleteAllOrders() {
        orderMap.clear();
    }

    public int getOrderSize() {
        return orderMap.size();
    }

    public boolean containOrder(int orderId) {
        return orderMap.containsKey(orderId);
    }

}
