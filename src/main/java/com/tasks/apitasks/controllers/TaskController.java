package com.tasks.apitasks.controllers;

import com.tasks.apitasks.model.Task;
import com.tasks.apitasks.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity createTask(@RequestBody Task task){
        return new ResponseEntity(taskService.createTask(task), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getTask(@PathVariable("id") Long idTask){
        return new ResponseEntity(taskService.getTask(idTask), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateTask(@PathVariable("id") Long idTask, @RequestBody Task task){
        return new ResponseEntity(taskService.updateTask(idTask,task), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTask(@PathVariable("id") Long idTask){
        boolean response = taskService.deleteTask(idTask);
        if(response== true){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
