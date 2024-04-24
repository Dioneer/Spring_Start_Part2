package Pegas.lection3.dto;

import Pegas.lection3.entity.Status;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Value
public class TaskReadDto {
    Integer id;
    String name;
    String description;
    Status status;
    @DateTimeFormat (pattern = "dd-MM-yyyy")
    LocalDateTime completionTime;
}
