package careapp.projectbackendcareapp.repository;

import careapp.projectbackendcareapp.domain.User;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaUserRepository implements UserRepository {

    private final EntityManager em;

    public JpaUserRepository(EntityManager em){
        this.em = em;
    }

    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = em.find(User.class, id);
        return Optional.ofNullable(user);
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        List<User> result = em.createQuery("select u from User u where u.userId= :userId", User.class)
                .setParameter("userId", userId)
                .getResultList();
        return result.stream().findAny();

    }

    @Override
    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class)
                .getResultList();

    }// 객체 대상으로 쿼리를 날려 객체 대상으로 데이터를 가져옴
}
