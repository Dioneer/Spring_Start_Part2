package Pegas.lection4.repository;

import Pegas.lection4.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepositoryy {
    private Map<Long, User> users = new ConcurrentHashMap<>();
    private AtomicLong counter = new AtomicLong();

    public List<User> findAll(){
        return new ArrayList<>(users.values());
    }

    public User findById(Long id){
        return users.get(id);
    }

    public User save(User user){
        if (user.getId()==null){
            user.setId(counter.incrementAndGet());
        }
        users.put(user.getId(), user);
        return user;
    }
}
