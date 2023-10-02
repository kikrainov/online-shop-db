package org.example.dao;

import org.example.model.Order;
import org.example.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addProduct(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public List<Product> listProducts() {
        TypedQuery<Product> typedQuery = sessionFactory.getCurrentSession().createQuery("from Product");
        return typedQuery.getResultList();
    }

    @Override
    public Product getProduct(String name) {
        String HQL = "from Product product where product.name = :name";
        return sessionFactory
                .getCurrentSession()
                .createQuery(HQL, Product.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
