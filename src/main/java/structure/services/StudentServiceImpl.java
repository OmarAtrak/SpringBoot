package structure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import structure.dtos.StudentDto;
import structure.dtos.StudentIdDto;
import structure.entities.StudentEntity;
import structure.entities.StudentID;
import structure.mappers.StudentMapper;
import structure.repositories.StudentRepository;
import structure.repositories.StudentRepositoryImpl;

import java.util.List;

@Service("service")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepositoryImpl studentRepository;
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public StudentDto save(StudentDto studentDto) {
        studentRepository.save(studentMapper.convertStudentDtoToStudentEntity(studentDto));
        return studentDto;
    }

    @Override
    public StudentDto update(StudentDto studentDto) {
        studentRepository.update(studentMapper.convertStudentDtoToStudentEntity(studentDto));
        return studentDto;
    }

    @Override
    public boolean delete(long id) {
        studentRepository.delete(id);
        return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        return studentMapper.convertEntitysToDtos(studentRepository.getData());
    }

    @Override
    public StudentDto findById(StudentIdDto idDto) {
//        return studentMapper.convertStudentEntityToStudentDto(studentRepository.getData().stream().filter(student -> student.getId()==studentMapper.convertStudentIdDtoToStudentId(idDto)));
        return  new StudentDto();
    }
}
