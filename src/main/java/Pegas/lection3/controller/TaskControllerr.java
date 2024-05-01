package Pegas.lection3.controller;

import Pegas.lection3.dto.TaskCreateUpdateDto;
import Pegas.lection3.dto.TaskReadDto;
import Pegas.lection3.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskControllerr {
    private final TaskService taskService;

    @GetMapping
    public List<TaskReadDto> findAll(){
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public TaskReadDto findById(@PathVariable Integer id){
        return taskService.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public TaskReadDto create(@RequestBody TaskCreateUpdateDto in) {
        return taskService.create(in);
    }

    @PutMapping("/{id}")
    public TaskReadDto update(@PathVariable("id") Integer id, @RequestBody TaskCreateUpdateDto user){
        return taskService.update(id, user)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        if (!taskService.delete(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
