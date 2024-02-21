package com.training.taskManagementSystem.service;

import com.training.taskManagementSystem.model.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task createTask(Task task);

    Task updateTask(Long id, Task updatedTask);

    boolean deleteTask(Long id);
}
