package org.ormond;

import org.ormond.dao.UserDAO;
import org.ormond.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = context.getBean(UserDAO.class);
        List<User> users = userDAO.getAllUsers();
        System.out.println(users);
    }
}