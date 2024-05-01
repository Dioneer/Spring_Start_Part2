package Pegas.seminar3.task3.service;

import Pegas.seminar3.task3.entity.User;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final NotificationService notificationService;

    public User createUser(String name, String age, LocalDateTime email){
        User user = User.builder()
                .name_task(name)
                .description(age)
                .completion_time(email)
                .build();
        notificationService.notifyUser(user);
        return user;
    }
}
