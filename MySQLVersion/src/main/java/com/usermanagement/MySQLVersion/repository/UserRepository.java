package com.usermanagement.MySQLVersion.repository;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.usermanagement.MySQLVersion.models.User;

@Repository
public interface UserRepository {
    /*
     * Interface pour la sauvegarde des utilisateurs dans la base de données MySQL
     */
    void save(User user);
    /*
     * Trouve un utilisateur par son ID
     */
    Optional<User> findById(Long id);
    /*
     * Trouve tous les utilisateurs
     */
    List<User> findAll();
    /*
     * Supprime un utilisateur par son ID
     */
    void delete(Long id);
}
