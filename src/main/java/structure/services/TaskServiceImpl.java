package structure.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import structure.dtos.Task.TaskDto;
import structure.mappers.TaskMapper;
import structure.repositories.TaskRepositoryImpl;

import java.util.List;

@Service("taskService")
public class TaskServiceImpl implements TaskService{
    private TaskRepositoryImpl taskRepository;
    private TaskMapper taskMapper;

    public TaskServiceImpl(@Qualifier("taskRepo") TaskRepositoryImpl taskRepository, TaskMapper taskMapper){
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskDto save(TaskDto taskDto) {
        taskRepository.save(taskMapper.TaskDtoToTaskEntity(taskDto));
        return taskDto;
    }

    @Override
    public TaskDto update(TaskDto taskDto) {
        taskRepository.update(taskMapper.TaskDtoToTaskEntity(taskDto));
        return taskDto;
    }

    @Override
    public boolean delete(long id) {
        taskRepository.delete(id);
        return true;
    }

    @Override
    public List<TaskDto> selectAll() {
        return taskMapper.TaskEntitysToTaskDtos(taskRepository.selectAll());
    }

    @Override
    public TaskDto findById(long id) {
        return taskMapper.TaskEntityToTaskDto(taskRepository.findById(id));
    }
}
