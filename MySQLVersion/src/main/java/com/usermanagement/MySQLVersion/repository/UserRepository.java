package com.usermanagement.MySQLVersion.repository;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.usermanagement.MySQLVersion.models.User;

/**
 * Interface pour la gestion des utilisateurs dans la base de données MySQL
 */
@Repository
public interface UserRepository {
    /**
     * Interface pour la sauvegarde des utilisateurs dans la base de données MySQL
     * @param user represente l'utilisateur à sauvegarder dans la base de données MySQL
     * 
     */
    void save(User user);
    /**
     * Trouve un utilisateur par son ID
     * @param id : ID de l'utilisateur à trouver
     * @return Optional contenant l'utilisateur trouvé ou vide si aucun utilisateur n'est trouvé avec l'ID fourni
     */
    Optional<User> findById(Long id);
    /**
     * Trouve tous les utilisateurs
     * @return List
     * 
     */
    List<User> findAll();
    /**
     * Supprime un utilisateur par son ID
    * @param id : ID de l'utilisateur à supprimer
     * 
     */
    void delete(Long id);
}
