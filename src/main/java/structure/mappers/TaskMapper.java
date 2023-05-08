package structure.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import structure.dtos.Task.TaskDto;
import structure.entities.Task.TaskEntity;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {
    public TaskDto TaskEntityToTaskDto(TaskEntity taskEntity){
        TaskDto taskDto = new TaskDto();
        taskDto.setId(taskEntity.getId());
        taskDto.setDescription(taskEntity.getDescription());
        taskDto.setDate(taskEntity.getDate());
        taskDto.setStatus(taskEntity.getStatus());
        return taskDto;
    }
    public TaskEntity TaskDtoToTaskEntity(TaskDto taskDto){
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setId(taskDto.getId());
        taskEntity.setDescription(taskDto.getDescription());
        taskEntity.setDate(taskDto.getDate());
        taskEntity.setStatus(taskDto.getStatus());
        return taskEntity;
    }

    public List<TaskDto> TaskEntitysToTaskDtos(List<TaskEntity> taskEntities){
        return taskEntities.stream().map(task -> TaskEntityToTaskDto(task)).collect(Collectors.toList());
    }
    public List<TaskEntity> TaskDtoToTaskEntitys(List<TaskDto> taskDtos){
        return taskDtos.stream().map(task -> TaskDtoToTaskEntity(task)).collect(Collectors.toList());
    }
}
