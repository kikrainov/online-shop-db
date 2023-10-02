package org.example.service;

import org.example.dao.CategoryDao;
import org.example.dao.UserDao;
import org.example.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired()
    private CategoryDao categoryDao;

    @Transactional
    @Override
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Category> listCategories() {
        return categoryDao.listCategories();
    }
}
