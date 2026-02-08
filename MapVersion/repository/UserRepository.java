package MapVersion.repository;
import java.util.List;
import java.util.Optional;

import MapVersion.models.User;

/**
 * Interface définissant les opérations de base pour la gestion des utilisateurs.
 */
public interface UserRepository {
    void save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void delete(Long id);
}
