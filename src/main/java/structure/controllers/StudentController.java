package structure.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import structure.dtos.StudentDto;
import structure.services.StudentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    public final static Logger LOGGER = LoggerFactory.getLogger(StudentDto.class);
    private final StudentServiceImpl service;

    StudentController(@Qualifier("service") StudentServiceImpl service){
        this.service = service;
    }

    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto dto){
        LOGGER.debug("start method Save");
        System.out.println("save success");
        return service.save(dto);
    }

    @PutMapping("/update")
    public StudentDto update(@RequestBody StudentDto dto){
        LOGGER.debug("start method Update");
        System.out.println("update success");
        return service.update(dto);
    }

    @DeleteMapping ("/delete/{id}")
    public boolean delete(@PathVariable("id") long id) {
        LOGGER.debug("start method Delete");
        System.out.println("delete success");
        return service.delete(id);
    }

    @GetMapping("/index")
    public List<StudentDto> selectAll(){
        LOGGER.debug("start methode Select All");
        System.out.println("get data success");
        return service.selectAll();
    }
}
