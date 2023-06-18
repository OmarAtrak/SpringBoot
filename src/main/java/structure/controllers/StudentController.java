package structure.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import structure.dtos.StudentDto;
import structure.services.StudentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    public final static Logger LOGGER = LoggerFactory.getLogger(StudentDto.class);
    private final StudentServiceImpl service;

    StudentController(@Qualifier("studentService") StudentServiceImpl service){
        this.service = service;
    }

    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto dto){
        LOGGER.debug("start method Save Student");
        System.out.println("save student success");
        return service.save(dto);
    }

    @PutMapping("/update")
    public StudentDto update(@RequestBody StudentDto dto){
        LOGGER.debug("start method Update Student");
        System.out.println("update student success");
        return service.update(dto);
    }

    @DeleteMapping ("/delete/{id}")
    public boolean delete(@PathVariable("id") long id) {
        LOGGER.debug("start method Delete Student");
        System.out.println("delete student success");
        return service.delete(id);
    }

    @GetMapping("/index")
    public List<StudentDto> selectAll(){
        LOGGER.debug("start methode Select All Student");
        System.out.println("get student data success");
        return service.selectAll();
    }

    @GetMapping("{id}")
    public StudentDto selectStudent(@PathVariable("id") long id){
        LOGGER.debug("start methode Select Student");
        System.out.println("get Student success");
        return service.findById(id);
    }
}
