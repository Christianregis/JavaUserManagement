package MapVersion.controllers;

import MapVersion.services.UserService;
import MapVersion.services.UserServiceImpl;
import java.util.Scanner;
import MapVersion.models.User;

public class UserController {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        String choix;
        Scanner scanner = new Scanner(System.in);

        System.out.println("****** Bienvenue sur notre platforme de gestion des utilisateurs ******");
        while (true) {
            System.out.println(
                    "Voici les options : \n1.Ajouter un utilisateur\n2.Recuperer un utlisateur\n3.Supprimer un utilisatueur\n4.Afficher tous les utilisateurs\n##.Quitter");
            choix = scanner.next();
            switch (choix) {
                case "1":
                    System.out.println("Entrez l'ID utilisateur");
                    Long id = scanner.nextLong();
                    System.out.println("Entrez le nom Utilisateur");
                    String name = scanner.next();
                    System.out.println("Entrez l'email Utilisateur");
                    String email = scanner.next();

                    User user = new User(id, name, email);
                    userService.addUser(user);
                    break;
                case "2":
                    System.out.println("Entrez l'ID de l'utilisateur");
                    Long userID = scanner.nextLong();
                    System.out.println(userService.getUser(userID).toString());
                    break;
                case "3":
                    System.out.println("Entrez l'ID de l'utilisateur");
                    Long userIDToDelete = scanner.nextLong();
                    userService.deleteUser(userIDToDelete);
                    break;
                case "4":
                    System.out.println("Liste de tous les utilisateurs :");
                    for (User u : userService.getAllUsers()) {
                        System.out.println(u.toString());
                    }
                    break;
                case "##":
                    System.out.println("Merci pour votre utilisation !");
                default:
                    System.out.println("Entree Invalide !");
                    break;
            }

        }
    }
}
