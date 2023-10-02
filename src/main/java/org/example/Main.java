package org.example;

import org.example.config.AppConfig;
import org.example.model.*;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        List<Subcategory > transportSubcategories = new ArrayList<>();
        transportSubcategories.add(new Subcategory("Легковые", 600, true));

        List<Category> transportCategories = new ArrayList<>();
        transportCategories.add(new Category("Транспорт", 600, true, transportSubcategories));

        List<Order> orders1 = new ArrayList<>();
        List<Product> products1 = new ArrayList<>();
        products1.add(new Product("Машина", "Легковой автомобиль", 3000000, true, transportCategories, transportSubcategories));

        User user1 = new User("Ivan", "Petrov", "ivan@petrov.ru", orders1, true);
        userService.addUser(user1);

        orders1.add(new Order(12, "28.10.2023", products1, 1, user1, true));

        context.close();
    }
}