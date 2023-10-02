package org.example.service;

import org.example.dao.ProductDao;
import org.example.dao.UserDao;
import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Product> listProducts() {
        return productDao.listProducts();
    }

    @Transactional
    @Override
    public Product getProduct(String name) {
        return productDao.getProduct(name);
    }
}
