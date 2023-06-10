package com.tasker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tasker.DTOS.UserDTO;
import com.tasker.entities.User;
import com.tasker.services.UserService;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/signin")
    public String loginRoute() {
        return "pages/login";
    }

    @PostMapping("/login")
    public String login(String email, String password) {
       UserDTO loggedUser = userService.findByEmailAndPassword(email, password);
        return loggedUser != null ? "pages/list": "pages/login";
    }

    @GetMapping("/register")
    public String registerRoute() {
        return "pages/register";
    }

    @PostMapping("/register")
    public String register(User user) {
        userService.create(user);
        return "pages/list";
    }
}