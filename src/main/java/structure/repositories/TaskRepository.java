package structure.repositories;

import structure.entities.Task.TaskEntity;

import java.util.List;

public interface TaskRepository {
    long save(TaskEntity e);
    boolean update(TaskEntity e);
    boolean delete(long id);
    List<TaskEntity> selectAll();
    TaskEntity findById(long id);
}
