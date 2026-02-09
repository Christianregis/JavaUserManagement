package com.usermanagement.MySQLVersion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.MySQLVersion.models.User;
import com.usermanagement.MySQLVersion.services.UserService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Contrôleur REST pour la gestion des utilisateurs dans la base de données MySQL
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    /**
     * Constructeur pour l'injection de dépendance du service utilisateur
     * @param userService : Service de gestion des utilisateurs à injecter
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Renvoie la liste de tous les utilisateurs
     * 
     * @return ResponseEntity contenant la liste de tous les utilisateurs et le statut HTTP OK
     */
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUser());
    }

    /**
     * Renvoie un utilisateur par son ID
     * @param id : ID de l'utilisateur à récupérer
     * 
     * @return ResponseEntity contenant l'utilisateur correspondant à l'ID fourni et le statut HTTP OK
     */
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

    /**
     * Ajoute un nouvel utilisateur à la base de données MySQL
     * @param user : L'utilisateur à ajouter à la base de données
     * 
     * @return ResponseEntity contenant l'utilisateur ajouté et le statut HTTP CREATED
     */
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    /**
     * Supprime un utilisateur par son ID
     * @param id : ID de l'utilisateur à supprimer
     * 
     * @return ResponseEntity contenant un message de confirmation et le statut HTTP OK
     */
    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("Utilisateur avec ID "+id+" Supprimee !");
    }
}

