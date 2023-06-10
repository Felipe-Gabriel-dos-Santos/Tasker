package com.tasker.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasker.DTOS.TaskDTO;
import com.tasker.entities.Task;
import com.tasker.entities.TaskStatus;
import com.tasker.repositories.TaskRepository;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Autowired
    ModelMapper modelMapper;

    public TaskDTO create(Task task) {
        task.setCreatedAt(LocalDateTime.now());
        Task addedTask = taskRepository.save(task);

        return modelMapper.map(addedTask, TaskDTO.class);
    }

    public List<TaskDTO> findAll() {
        List<Task> tasks = taskRepository.findAll();

        return tasks.stream().filter(task -> !task.getIsDeleted())
        .map(task -> modelMapper.map(task, TaskDTO.class)).collect(Collectors.toList());
    }

    public void delete(Task task) {
        taskRepository.delete(task);
    }
}