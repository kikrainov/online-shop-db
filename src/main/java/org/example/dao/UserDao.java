package org.example.dao;

import org.example.model.Subcategory;
import org.example.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> listUsers();
    User getUser(long id);

}
