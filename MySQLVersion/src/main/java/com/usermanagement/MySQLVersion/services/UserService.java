package com.usermanagement.MySQLVersion.services;

import java.util.List;

import com.usermanagement.MySQLVersion.models.User;

public interface UserService {
    void addUser(User user);
    User getUser(Long id);
    List<User> getAllUser();
    void deleteUser(Long id);
}
