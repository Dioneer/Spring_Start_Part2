package Pegas.seminar3.task3.service;

import Pegas.seminar3.task3.entity.User;
import Pegas.seminar3.task3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
@Value
public class DataProcessingService {
    private UserRepository repository;

    public List<User> sortUserByAge(List<User> users){
        return users.stream().sorted(Comparator.comparing(User::getAge))
                .toList();
    }

    public List<User> filterUserByAge(List<User> users, int age){
        return users.stream().filter(user-> user.getAge()>age)
                .toList();
    }

    public double calculateAverageAge(List<User> users){
        return users.stream().mapToInt(User::getAge).average().orElse(0);
    }
}
