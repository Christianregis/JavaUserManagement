package MapVersion.repository;
import java.util.Optional;
import MapVersion.models.User;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    public Map<Long, User> userMap = new HashMap<>();

    @Override
    public void save(User user) {
        userMap.put(user.getId(), user);
        System.out.println("Utilisateur " + user.getName() + " enregistré");
    }

    @Override
    public Optional<User> findById(Long id) {
        // Implémentation de la méthode pour trouver un utilisateur par son ID
        return Optional.ofNullable(userMap.get(id));
    }

    @Override
    public List<User> findAll() {
        // Implémentation de la méthode pour trouver tous les utilisateurs
        return List.copyOf(userMap.values());
    }

    @Override
    public void delete(Long id) {
        // Implémentation de la méthode pour supprimer un utilisateur par son ID
        userMap.remove(id);
        System.out.println("Utilisateur avec ID " + id + " supprimé");
    }
    
}
