package com.usermanagement.MySQLVersion.services;

import java.util.List;

import com.usermanagement.MySQLVersion.models.User;

/**
 * Interface pour la gestion des utilisateurs dans la base de données MySQL
 */
public interface UserService {
    /**
     * Ajoute un nouvel utilisateur à la base de données MySQL
     * @param user : Represente l'utilisateur à ajouter à la base de données MySQL
     */
    void addUser(User user);
    /**
     * Recupère un utilisateur par son ID
     * @param id : ID de l'utilisateur à récupérer
     * @return User
     */
    User getUser(Long id);
        /**
        * Recupère tous les utilisateurs
        * @return List
        */
    List<User> getAllUser();
    /**
     * Supprime un utilisateur par son ID
     * @param id : ID de l'utilisateur à supprimer
     */
    void deleteUser(Long id);
}
