package org.example.dao;

import org.example.model.Order;

import java.util.List;

public interface OrderDao {

    void addOrder(Order order);
    List<Order> listOrders();
    Order getOrder(String name);

}
