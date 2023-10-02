package org.example.service;

import org.example.dao.SubcategoryDao;
import org.example.dao.UserDao;
import org.example.model.Subcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubcategoryServiceImpl implements SubcategoryService{
    @Autowired
    private SubcategoryDao subcategoryDao;

    @Transactional
    @Override
    public void addSubcategory(Subcategory subcategory) {
        subcategoryDao.addSubcategory(subcategory);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Subcategory> listSubcategories() {
        return subcategoryDao.listSubcategories();
    }
}
