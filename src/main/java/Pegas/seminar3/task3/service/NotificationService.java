package Pegas.seminar3.task3.service;

import Pegas.seminar3.task3.entity.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyUser(User user) {
            System.out.println("A new user has been added: "+user.getName());
    }
    public void sendNotifyU(String s) {
        System.out.println("s");
    }
}
