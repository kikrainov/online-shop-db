package org.example.service;

import org.example.model.Category;

import java.util.List;

public interface CategoryService {

    void addCategory(Category category);
    List<Category> listCategories();

}
