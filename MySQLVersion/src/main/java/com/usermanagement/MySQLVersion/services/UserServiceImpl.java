package com.usermanagement.MySQLVersion.services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.usermanagement.MySQLVersion.models.User;
import com.usermanagement.MySQLVersion.repository.UserRepositotyImpl;

@Service
public class UserServiceImpl implements UserService{
    public JdbcTemplate jdbcTemplate;
    public UserRepositotyImpl userRepositotyImpl;

    public UserServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.userRepositotyImpl = new UserRepositotyImpl(jdbcTemplate);
    }

    @Override
    public void addUser(User user) {
        userRepositotyImpl.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepositotyImpl.findById(id).orElseThrow();
    }

    @Override
    public List<User> getAllUser() {
        return userRepositotyImpl.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepositotyImpl.delete(id);
    }
    
}
