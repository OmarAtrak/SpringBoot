package structure.services;

import structure.dtos.StudentDto;
import structure.dtos.StudentIdDto;

import java.util.List;

public interface StudentService {
    StudentDto save(StudentDto e);
    StudentDto update(StudentDto e);
    boolean delete(long id);
    List<StudentDto> selectAll();
    StudentDto findById(StudentIdDto idDto);
}
