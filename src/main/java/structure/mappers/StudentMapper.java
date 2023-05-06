package structure.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import structure.dtos.AdresseDto;
import structure.dtos.CourseDto;
import structure.dtos.StudentDto;
import structure.dtos.StudentIdDto;
import structure.entities.Adresse;
import structure.entities.CourseEntity;
import structure.entities.StudentEntity;
import structure.entities.StudentID;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    // convert studentId to studentIdDto
    public StudentIdDto convertStudentIdToStudentIdDto(StudentID studentId){
        return new StudentIdDto(studentId.getId(), studentId.getCode(), studentId.getAlias());
    }
    // convert studentId to studentIdDto
    public StudentID convertStudentIdDtoToStudentId(StudentIdDto studentIdDto){
        return new StudentID(studentIdDto.getId(), studentIdDto.getCode(), studentIdDto.getAlias());
    }

    // convert Adresse to adresseDto
    public AdresseDto convertAdresseToAdresseDto(Adresse adresse){
        AdresseDto adresseDto = new AdresseDto();
        adresseDto.setNumber(adresse.getNumber());
        adresseDto.setRue(adresse.getRue());
        adresseDto.setAvenue(adresse.getAvenue());
        return adresseDto;
    }
    // convert AdresseDto to Adresse
    public Adresse convertAdresseDtoToAdresse(AdresseDto adresseDto){
        Adresse adresse = new Adresse();
        adresse.setNumber(adresseDto.getNumber());
        adresse.setRue(adresseDto.getRue());
        adresse.setAvenue(adresseDto.getAvenue());
        return adresse;
    }

    // convert course to courseDto
    public CourseDto convertCourseToCourseDto(CourseEntity course){
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setName(course.getName());
        return courseDto;
    }
    // convert courseDto to course
    public CourseEntity convertCourseDtoToCourse(CourseDto courseDto){
        CourseEntity course = new CourseEntity();
        course.setId(course.getId());
        course.setName(course.getName());
        return course;
    }
    // convert Courses to courseDto
    public List<CourseDto> convertCoursesToCoursesDto(List<CourseEntity> courses){
        return courses.stream().map(course -> convertCourseToCourseDto(course)).collect(Collectors.toList());
    }
    // convert CouresDto to Courses
    public List <CourseEntity> convertCoursesDtoToCourse(List<CourseDto> courseDtos){
        return courseDtos.stream().map(courseDto -> convertCourseDtoToCourse(courseDto)).collect(Collectors.toList());
    }

    public StudentDto convertStudentEntityToStudentDto(StudentEntity entity){
        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAdresse(convertAdresseToAdresseDto(entity.getAdresse()));
        dto.setCourses(convertCoursesToCoursesDto(entity.getCourses()));
        return dto;
    }
    public StudentEntity convertStudentDtoToStudentEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAdresse(convertAdresseDtoToAdresse(dto.getAdresse()));
        entity.setCourses(convertCoursesDtoToCourse(dto.getCourses()));
        return entity;
    }
    public List <StudentDto> convertEntitysToDtos(List<StudentEntity> entities){
        return entities.stream().map(entity -> convertStudentEntityToStudentDto(entity)).collect(Collectors.toList());
    }
    public List <StudentEntity> convertDtoToEntity(List<StudentDto> dtos){
        return dtos.stream().map(dto -> convertStudentDtoToStudentEntity(dto)).collect(Collectors.toList());
    }
}
