package org.example.service;

import org.example.model.Order;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);
    List<Order> listOrders();
    Order getOrder(String name);

}
