package org.example.dao;

import org.example.model.Order;
import org.example.model.Product;

import java.util.List;

public interface ProductDao {
    void addProduct(Product product);
    List<Product> listProducts();
    Product getProduct(String name);
}
