package com.training.taskManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.training.taskManagementSystem.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
