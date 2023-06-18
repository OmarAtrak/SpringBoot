package structure.repositories;

import org.springframework.stereotype.Repository;
import structure.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;

@Repository(value="repo")
public class StudentRepositoryImpl implements StudentRepository{

    private static final List<StudentEntity> data = new ArrayList<>();
    public static long idStudent = 0;
    public static long idCourse = 0;


    @Override
    public long save(StudentEntity studentEntity) {
        studentEntity.setId(++idStudent);
        studentEntity.getCourses().forEach(courseEntity -> courseEntity.setId(++idCourse));
        data.add(studentEntity);
        return 1;
    }

    @Override
    public boolean update(StudentEntity studentEntity) {
        int indexObject = -1;
        for (int index = 0 ; index < data.size(); index++){
            if(data.get(index).getId() == studentEntity.getId()){
                indexObject = index;
            }
        }
        if (indexObject != -1){
            data.remove(indexObject);
            studentEntity.getCourses().forEach(courseEntity -> courseEntity.setId(++idCourse));
            data.add(indexObject, studentEntity);
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
    public List<StudentEntity> selectAll() {
        return data;
    }

    @Override
    public StudentEntity findById(long id) {
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
