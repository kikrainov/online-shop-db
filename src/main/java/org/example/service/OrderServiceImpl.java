package org.example.service;

import org.example.dao.OrderDao;
import org.example.dao.UserDao;
import org.example.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderDao orderDao;

    @Transactional
    @Override
    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Order> listOrders() {
        return orderDao.listOrders();
    }

    @Transactional
    @Override
    public Order getOrder(String name) {
        return orderDao.getOrder(name);
    }
}
