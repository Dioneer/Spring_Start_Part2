package Pegas.lection4.service;

import Pegas.lection4.entity.User;
import Pegas.lection4.repository.UserRepositoryy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositoryy userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null, "Sergey", "qwe@qwe.ru"));
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }
}
