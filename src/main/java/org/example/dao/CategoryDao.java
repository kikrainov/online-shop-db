package org.example.dao;

import org.example.model.Category;

import java.util.List;

public interface CategoryDao {

    void addCategory(Category category);
    List<Category> listCategories();

}
