package repository;

import domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user); //회원가입
    Optional<User> findById(Long id); //로그인
    List<User> findAll();
}
