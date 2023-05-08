package structure.repositories;

import structure.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    long save(StudentEntity e);
    boolean update(StudentEntity e);
    boolean delete(long id);
    List<StudentEntity> selectAll();
    StudentEntity findById(long id);
}
