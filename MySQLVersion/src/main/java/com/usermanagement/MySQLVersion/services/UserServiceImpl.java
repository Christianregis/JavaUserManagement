package com.usermanagement.MySQLVersion.services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.usermanagement.MySQLVersion.models.User;
import com.usermanagement.MySQLVersion.repository.UserRepositotyImpl;

/**
 * Implémentation de l'interface UserService pour la gestion des utilisateurs dans la base de données MySQL
 */
@Service
public class UserServiceImpl implements UserService{
    /**
     * JdbcTemplate pour les opérations de base de données et UserRepositotyImpl pour la gestion des utilisateurs dans la base de données MySQL
     */
    public JdbcTemplate jdbcTemplate;
    /**
     * UserRepositotyImpl pour la gestion des utilisateurs dans la base de données MySQL
     */
    public UserRepositotyImpl userRepositotyImpl;

    /**
     * Constructeur pour l'injection de dépendance du JdbcTemplate et l'initialisation de UserRepositotyImpl
     * @param jdbcTemplate : JdbcTemplate à injecter pour les opérations de base de données
     */
    public UserServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.userRepositotyImpl = new UserRepositotyImpl(jdbcTemplate);
    }

    /**
     * Implémentation de l'interface UserService pour la gestion des utilisateurs dans la base de données MySQL
     * @param user represente l'utilisateur à sauvegarder dans la base de données MySQL
     */
    @Override
    public void addUser(User user) {
        userRepositotyImpl.save(user);
    }

    /**
     * Récupère un utilisateur par son ID dans la base de données MySQL
     * @param id : ID de l'utilisateur à récupérer
     * @return User correspondant à l'ID fourni ou une exception si aucun utilisateur n'est trouvé avec l'ID fourni
     */
    @Override
    public User getUser(Long id) {
        return userRepositotyImpl.findById(id).orElseThrow();
    }

    /**
     * Récupère tous les utilisateurs dans la base de données MySQL
     * @return List de tous les utilisateurs présents dans la base de données MySQL
     */
    @Override
    public List<User> getAllUser() {
        return userRepositotyImpl.findAll();
    }

    /**
     * Supprime un utilisateur par son ID dans la base de données MySQL
     * @param id : ID de l'utilisateur à supprimer
     */
    @Override
    public void deleteUser(Long id) {
        userRepositotyImpl.delete(id);
    }
    
}
