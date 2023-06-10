package com.tasker.controller;

import com.tasker.DTOS.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tasker.entities.Task;
import com.tasker.services.TaskService;

import jakarta.validation.Valid;

import java.util.List;

@Controller
public class HomeController {
    
    @Autowired
    public TaskService taskService;

    @GetMapping("/create")
    public String createRoute(@ModelAttribute("task") Task task) {
        return "pages/create";
    }

    @PostMapping("/create")
    public String createTask(@ModelAttribute("task") Task task) {
        taskService.create(task);
        return "redirect:/";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<TaskDTO> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);

        return "pages/list";
    }
}