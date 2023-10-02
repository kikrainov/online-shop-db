package org.example.service;

import org.example.model.Product;
import org.example.model.Subcategory;

import java.util.List;

public interface SubcategoryService {

    void addSubcategory(Subcategory subcategory);
    List<Subcategory> listSubcategories();

}
