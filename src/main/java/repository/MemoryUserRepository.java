package repository;

import domain.User;

import java.util.*;

public class MemoryUserRepository implements UserRepository {

    private static Map<Long, User> store = new HashMap<>();
    private static long sequence = 0L;
    @Override
    public User save(User user) {
        user.setId(++sequence);
        store.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(store.get(id)); //optional.of : null이 반환될때 대비
    }
    @Override
    public Optional<User> findByName(Long user_id) {
        return store.values().stream()
                .filter(user -> user.getUser_id().equals(user_id))
                .findAny();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(store.values());
    }
}
