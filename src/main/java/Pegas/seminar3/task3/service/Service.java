package Pegas.seminar3.task3.service;

import Pegas.seminar3.task3.entity.User;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final NotificationService notificationService;

    public User createUser(String name, int age, String email){
        User user = User.builder()
                .name(name)
                .age(age)
                .email(email)
                .build();
        notificationService.notifyUser(user);
        return user;
    }
}
