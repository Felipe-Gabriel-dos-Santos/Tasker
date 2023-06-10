package com.tasker.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tasker.entities.TaskStatus;

@Repository
public interface TaskStatusRepository extends JpaRepository<TaskStatus, UUID> {
    
}