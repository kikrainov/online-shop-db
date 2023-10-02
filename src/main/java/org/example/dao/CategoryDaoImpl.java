package org.example.dao;

import org.example.model.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCategory(Category category) {
        sessionFactory.getCurrentSession().save(category);

    }

    @Override
    public List<Category> listCategories() {
        TypedQuery<Category> typedQuery = sessionFactory.getCurrentSession().createQuery("from Category");
        return typedQuery.getResultList();
    }

}
