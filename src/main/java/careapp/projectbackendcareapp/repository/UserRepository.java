package careapp.projectbackendcareapp.repository;
//회원 객체를 저장하는 저장소
import careapp.projectbackendcareapp.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user); //회원가입
    Optional<User> findById(Long id); //로그인
    Optional<User> findByUserId(String userId); //로그인
    List<User> findAll(); //저장된 모든 회원 리스트 반환
}