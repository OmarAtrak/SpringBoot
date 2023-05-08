package structure.repositories;

import org.springframework.stereotype.Repository;
import structure.entities.Task.TaskEntity;
import java.util.ArrayList;
import java.util.List;

@Repository("taskRepo")
public class TaskRepositoryImpl implements TaskRepository{
    private static final List<TaskEntity> data = new ArrayList<>();


    @Override
    public long save(TaskEntity taskEntity) {
        data.add(taskEntity);
        return 1;
    }

    @Override
    public boolean update(TaskEntity taskEntity) {
        int indexObject = -1;
        for (int index = 0 ; index < data.size(); index++){
            if(data.get(index).getId() == taskEntity.getId()){
                indexObject = index;
            }
        }
        if (indexObject != -1){
            data.remove(indexObject);
            data.add(indexObject, taskEntity);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        int indexObject = -1;
        for (int index = 0 ; index < data.size(); index++){
            if(data.get(index).getId() == id){
                indexObject = index;
            }
        }
        if (indexObject != -1){
            data.remove(indexObject);
            return true;
        }
        return false;
    }

    @Override
    public List<TaskEntity> selectAll() {
        return data;
    }

    @Override
    public TaskEntity findById(long id) {
        int indexObject = -1;
        for (int index = 0 ; index < data.size(); index++){
            if(data.get(index).getId() == id){
                indexObject = index;
            }
        }
        if (indexObject != -1){
            return data.get(indexObject);
        }
        return null;
    }
}
