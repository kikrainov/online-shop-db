package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "products_number")
    private long productsNumber;

    @Column(name = "is_active")
    private boolean isActive;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "subcategory_id")
    private List<Subcategory> subcategories;

    public Category() {

    }

    public Category(String name, long productsNumber, boolean isActive, List<Subcategory> subcategories) {
        this.name = name;
        this.productsNumber = productsNumber;
        this.isActive = isActive;
        this.subcategories = subcategories;
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

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }
}
