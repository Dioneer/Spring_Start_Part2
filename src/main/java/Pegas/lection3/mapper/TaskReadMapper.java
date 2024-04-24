package Pegas.lection3.mapper;

import Pegas.lection3.dto.TaskReadDto;
import Pegas.lection3.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskReadMapper implements Mapper<Task, TaskReadDto>{
    @Override
    public TaskReadDto fromTo(Task task) {
        return new TaskReadDto(task.getId(), task.getName(), task.getDescription(),task.getStatus(), task.getCompletionTime());
    }
}
