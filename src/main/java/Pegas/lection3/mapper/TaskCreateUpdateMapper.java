package Pegas.lection3.mapper;

import Pegas.lection3.dto.TaskCreateUpdateDto;
import Pegas.lection3.entity.Task;
import lombok.Value;
import org.springframework.stereotype.Component;

@Value
@Component
public class TaskCreateUpdateMapper implements Mapper<TaskCreateUpdateDto, Task>{
    @Override
    public Task fromTo(TaskCreateUpdateDto from) {
        return Task.builder()
                .completionTime(from.getCompletionTime())
                .name(from.getName())
                .description(from.getDescription())
                .status(from.getStatus())
                .build();
    }
    public Task fromTo(TaskCreateUpdateDto from, Task task){
        task.setCompletionTime(from.getCompletionTime());
        task.setName(from.getName());
        task.setDescription(from.getDescription());
        task.setStatus(from.getStatus());
        return task;
    }
}
