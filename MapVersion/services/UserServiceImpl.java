package MapVersion.services;
import MapVersion.models.User;
import MapVersion.repository.UserRepository;
import MapVersion.repository.UserRepositoryImpl;
import java.util.List;

public class UserServiceImpl implements UserService{
    UserRepository userRepository = new UserRepositoryImpl();

    
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id){
        userRepository.delete(id);
    }
}
