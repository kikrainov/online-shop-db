package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private long price;

    @Column(name = "in_stock")
    private boolean inStock;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private List<Category> categories;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "subcategory_id")
    private List<Subcategory> subcategories;

    public Product() {
    }

    public Product(String name, String description, long price, boolean inStock, List<Category> categories, List<Subcategory> subcategories) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
        this.categories = categories;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }

    public List<Category> getCategory() {
        return categories;
    }

    public void setCategory(List<Category> categories) {
        this.categories = categories;
    }
}
