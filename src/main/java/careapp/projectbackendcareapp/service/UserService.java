package careapp.projectbackendcareapp.service;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MemoryUserRepository;
import repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

//    private final UserRepository userRepository = new MemoryUserRepository();

    //SignIn
    public Long join(User user){
        validateDuplicateUser(user);
        userRepository.save(user);
        return user.getId();
    }
    private void validateDuplicateUser(User user){
        userRepository.findByUserId(user.getUserId())
                .ifPresent(m ->{
                    throw new IllegalStateException("already exist");
                });
    }
    public List<User> findUsers() {
        return userRepository.findAll();
    }
    public Optional<User> findOne(String userId) {
        return userRepository.findByUserId(userId);
    }
}
