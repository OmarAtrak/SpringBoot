package structure.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import structure.dtos.Task.TaskDto;
import structure.services.TaskServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    public final static Logger LOGGER = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskServiceImpl taskService;


    @PostMapping("/save")
    public TaskDto save(@RequestBody TaskDto taskDto){
        LOGGER.debug("start method Save Task");
        System.out.println("save task success");
        return taskService.save(taskDto);
    }

    @PutMapping("/update")
    public TaskDto update(@RequestBody TaskDto taskDto){
        LOGGER.debug("start method Update Task");
        System.out.println("update task success");
        return taskService.update(taskDto);
    }

    @DeleteMapping ("/delete/{id}")
    public boolean delete(@PathVariable("id") long id) {
        LOGGER.debug("start method Delete Task");
        System.out.println("delete task success");
        return taskService.delete(id);
    }

    @GetMapping("/index")
    public List<TaskDto> selectAll(){
        LOGGER.debug("start methode Select All Task");
        System.out.println("get task data success");
        return taskService.selectAll();
    }

    @GetMapping("{id}")
    public TaskDto selectTask(@PathVariable("id") long id){
        LOGGER.debug("start methode Select Task");
        System.out.println("get Task success");
        return taskService.findById(id);
    }
}
