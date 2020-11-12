package careapp.projectbackendcareapp.repository;

import careapp.projectbackendcareapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaUserRepository extends JpaRepository<User, Long>, UserRepository {

    @Override
    Optional<User> findByUserId (String userId);
}
