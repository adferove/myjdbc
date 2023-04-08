package org.ormond.dao;

import org.ormond.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
}
