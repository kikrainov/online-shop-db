package org.example.dao;

import org.example.model.Product;
import org.example.model.Subcategory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SubcategoryDaoImpl implements SubcategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addSubcategory(Subcategory subcategory) {
        sessionFactory.getCurrentSession().save(subcategory);
    }

    @Override
    public List<Subcategory> listSubcategories() {
        TypedQuery<Subcategory> typedQuery = sessionFactory.getCurrentSession().createQuery("from Subcategory");
        return typedQuery.getResultList();
    }

}
