package com.tasks.apitasks.service;

import com.tasks.apitasks.model.Task;

import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);

    Optional<Task> getTask(Long idTask);

    Task updateTask(Long idTask, Task task);

    boolean deleteTask(Long idTask);

}
