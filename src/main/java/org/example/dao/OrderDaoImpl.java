package org.example.dao;

import org.example.model.Category;
import org.example.model.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addOrder(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public List<Order> listOrders() {
        TypedQuery<Order> typedQuery = sessionFactory.getCurrentSession().createQuery("from Order");
        return typedQuery.getResultList();
    }

    @Override
    public Order getOrder(String name) {
        String HQL = "from Order order where order.name = :name";
        return sessionFactory
                .getCurrentSession()
                .createQuery(HQL, Order.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
