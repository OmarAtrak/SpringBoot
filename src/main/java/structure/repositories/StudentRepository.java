package structure.repositories;

import org.springframework.stereotype.Repository;
import structure.entities.StudentEntity;
import structure.entities.StudentID;

import java.util.List;

public interface StudentRepository {
    long save(StudentEntity e);
    boolean update(StudentEntity e);
    boolean delete(long id);
    List<StudentEntity> selectAll();
    StudentEntity findById(StudentID id);
}
