package com.usermanagement.MySQLVersion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entité correspondant à la table {@code users} dans la base de données MySQL.
 */
@Entity
@Table(name = "users")
public class User {
    /**
     * Constructeur par défaut pour l'entité User.
     */
    public User() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    /**
     * Retourne l'identifiant de l'utilisateur.
     *
     * @return l'id de l'utilisateur
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant de l'utilisateur.
     *
     * @param id l'identifiant à définir
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne le nom de l'utilisateur.
     *
     * @return le nom de l'utilisateur
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom de l'utilisateur.
     *
     * @param name le nom à définir
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne l'adresse email de l'utilisateur.
     *
     * @return l'email de l'utilisateur
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit l'adresse email de l'utilisateur.
     *
     * @param email l'email à définir
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
