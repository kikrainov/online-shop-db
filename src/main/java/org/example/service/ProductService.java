package org.example.service;

import org.example.model.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    List<Product> listProducts();
    Product getProduct(String name);

}
