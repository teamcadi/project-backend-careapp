package repository;

import domain.User;

public interface UserRepository {
    User save(User user); //회원가입
    //User findByUser_idAndPassword(String user_id, String password); //로그인
    //List<User> findAll();
}
