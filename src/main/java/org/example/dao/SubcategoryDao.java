package org.example.dao;

import org.example.model.Category;
import org.example.model.Subcategory;

import java.util.List;

public interface SubcategoryDao {

    void addSubcategory(Subcategory subcategory);
    List<Subcategory> listSubcategories();

}
