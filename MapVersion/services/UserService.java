package MapVersion.services;
import MapVersion.models.User;
import java.util.List;
/**
 * Interface définissant les opérations de base pour la gestion des utilisateurs.
 */
public interface UserService {
    // Methodes pour ajouter, obtenir, lister et supprimer des utilisateurs
    void addUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();

    void deleteUser(Long id);
}
