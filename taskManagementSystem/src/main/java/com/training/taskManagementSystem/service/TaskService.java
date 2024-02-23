package com.training.taskManagementSystem.service;

import com.training.taskManagementSystem.model.Task;
import org.springframework.http.ResponseEntity;

public interface TaskService {
    ResponseEntity<?> getAllTasks();

    ResponseEntity<?> getTaskById(Long id);

    ResponseEntity<?> createTask(Task task);

    ResponseEntity<?> updateTask(Long id, Task updatedTask);

	ResponseEntity<?> markTaskAsCompleted(Long id, boolean completed);
	
	ResponseEntity<?> deleteTask(Long id);
}