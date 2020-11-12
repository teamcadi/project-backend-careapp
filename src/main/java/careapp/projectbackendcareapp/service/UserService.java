package careapp.projectbackendcareapp.service;

import careapp.projectbackendcareapp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import careapp.projectbackendcareapp.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
//@Service
public class UserService {
    private final UserRepository userRepository;

//    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

//    private final UserRepository userRepository = new MemoryUserRepository();

    //SignIn
    public Long join(User user){
        validateDuplicateUser(user); //중복 회원 검증
        userRepository.save(user);
        return user.getId(); //Id 반환
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
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }
}
