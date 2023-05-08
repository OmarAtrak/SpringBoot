package structure.services;
import structure.dtos.Task.TaskDto;

import java.util.List;

public interface TaskService {
    TaskDto save(TaskDto taskDto);
    TaskDto update(TaskDto taskDto);
    boolean delete(long id);
    List<TaskDto> selectAll();
    TaskDto findById(long id);
}
