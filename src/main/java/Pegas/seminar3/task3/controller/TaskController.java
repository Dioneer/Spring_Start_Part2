package Pegas.seminar3.task3.controller;

import Pegas.seminar3.task3.entity.User;
import Pegas.seminar3.task3.service.DataProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {
    private final DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks(){
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        return  tasks;
    }
    @GetMapping("/sort")
    public List<User> sortUsersById() {
        return service.sortUserByAge(service.getRepository().findAll());
    }

}
