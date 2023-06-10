package com.tasker.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.tasker.DTOS.TaskDTO;
import com.tasker.DTOS.TaskStatusDTO;
import com.tasker.entities.Task;
import com.tasker.entities.TaskStatus;
import com.tasker.repositories.TaskRepository;
import com.tasker.repositories.TaskStatusRepository;

public class TaskStatusService {
    @Autowired
    TaskStatusRepository taskStatusRepository;

    @Autowired
    ModelMapper modelMapper;

    public TaskStatusDTO create(TaskStatus taskStatus) {
        taskStatus.setCreatedAt(LocalDateTime.now());
        TaskStatus addedTaskStatus = taskStatusRepository.save(taskStatus);

        return modelMapper.map(addedTaskStatus, TaskStatusDTO.class);
    }

    public List<TaskStatusDTO> findAll() {
        List<TaskStatus> tasks = taskStatusRepository.findAll();

        return tasks.stream()
        .map(task -> modelMapper.map(task, TaskStatusDTO.class))
        .collect(Collectors.toList());
    }

}