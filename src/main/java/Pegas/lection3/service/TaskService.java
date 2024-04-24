package Pegas.lection3.service;

import Pegas.lection3.dto.TaskCreateUpdateDto;
import Pegas.lection3.dto.TaskReadDto;
import Pegas.lection3.entity.Task;
import Pegas.lection3.mapper.TaskCreateUpdateMapper;
import Pegas.lection3.mapper.TaskReadMapper;
import Pegas.lection3.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskCreateUpdateMapper taskCreateUpdateMapper;
    private final TaskReadMapper taskReadMapper;

    public List<TaskReadDto> findAll(){
        return taskRepository.findAll().stream()
                .map(taskReadMapper::fromTo)
                .toList();
    }

    public Optional<TaskReadDto> findById(Integer id){
        return taskRepository.findById(id)
                .map(taskReadMapper::fromTo);
    }
    @Transactional
    public TaskReadDto create(TaskCreateUpdateDto in){
        return Optional.of(in).map(i->taskCreateUpdateMapper.fromTo(i, new Task()))
                .map(taskRepository::save)
                .map(taskReadMapper::fromTo)
                .orElseThrow();
                
    }
    @Transactional
    public boolean delete(Integer id){
        return taskRepository.findById(id)
                .map(i->{
                    taskRepository.delete(i);
                    taskRepository.flush();
                    return true;
                }).orElse(false);

    }
    @Transactional
    public Optional<TaskReadDto> update(Integer id, TaskCreateUpdateDto task){
        return taskRepository.findById(id)
                .map(i->taskCreateUpdateMapper.fromTo(task, i))
                .map(taskRepository::save)
                .map(taskReadMapper::fromTo);

    }

}
