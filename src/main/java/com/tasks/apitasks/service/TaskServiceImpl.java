package com.tasks.apitasks.service;

import com.tasks.apitasks.model.Task;
import com.tasks.apitasks.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Optional<Task> getTask(Long idTask) {
        return taskRepository.findById(idTask);
    }

    @Override
    public Task updateTask(Long idTask, Task task) {
        Task taskFind = taskRepository.findById(idTask).get();
        taskFind.setStatus(taskFind.getStatus());
        taskFind.setCompleted(taskFind.isCompleted());
        return taskRepository.save(taskFind);
    }

    @Override
    public boolean deleteTask(Long idTask) {
        taskRepository.deleteById(idTask);
        return true;
    }
}