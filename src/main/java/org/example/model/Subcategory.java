package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "subcategories")
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "products_number")
    private long productsNumber;

    @Column(name = "is_active")
    private boolean isActive;

    public Subcategory() {

    }

    public Subcategory(String name, long productsNumber, boolean isActive) {
        this.name = name;
        this.productsNumber = productsNumber;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductsNumber() {
        return productsNumber;
    }

    public void setProductsNumber(long productsNumber) {
        this.productsNumber = productsNumber;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
