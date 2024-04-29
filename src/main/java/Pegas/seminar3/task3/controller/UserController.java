package Pegas.seminar3.task3.controller;

import Pegas.seminar3.task3.entity.User;
import Pegas.seminar3.task3.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private RegistrationService service;

    @GetMapping
    public List<User> userList(){
        return service.getDataProcessingService().getRepository().findAll();
    }

    @PostMapping("/body")
    public String createUser(@RequestBody User user){
        service.getDataProcessingService().getRepository().save(user);
        return "Add user from body";
    }
}
