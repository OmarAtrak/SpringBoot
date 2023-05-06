package structure.repositories;

import org.springframework.stereotype.Repository;
import structure.dtos.StudentDto;
import structure.entities.StudentEntity;
import structure.entities.StudentID;

import java.util.ArrayList;
import java.util.List;

@Repository(value="repo")
public class StudentRepositoryImpl implements StudentRepository{

    private static List<StudentEntity> data = new ArrayList<StudentEntity>();

    public List<StudentEntity> getData(){
        return this.data;
    }
    public void setData(List<StudentEntity> data){
        this.data = data;
    }

    @Override
    public long save(StudentEntity e) {
        data.add(e);
        return 1;
    }

    @Override
    public boolean update(StudentEntity e) {
        return false;
    }

    @Override
    public boolean delete(long id) {
//        this.data.remove(id);
        return true;
    }

    @Override
    public List<StudentEntity> selectAll() {
        return this.data;
    }

    @Override
    public StudentEntity findById(StudentID id) {
        return null;
    }
}
