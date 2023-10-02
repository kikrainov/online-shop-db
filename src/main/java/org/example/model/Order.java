package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "products_number")
    private long productsNumber;

    @Column(name = "delivery_date")
    private String deliveryDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "products")
    private List<Product> products;

    @Column(name = "total")
    private long total;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer")
    private User user;

    @Column(name = "is_active")
    private boolean isActive;

    public Order() {
    }

    public Order(long productsNumber, String deliveryDate, List<Product> products, int total, User user, boolean isActive) {
        this.productsNumber = productsNumber;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.total = total;
        this.user = user;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductsNumber() {
        return productsNumber;
    }

    public void setProductsNumber(long productsNumber) {
        this.productsNumber = productsNumber;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
