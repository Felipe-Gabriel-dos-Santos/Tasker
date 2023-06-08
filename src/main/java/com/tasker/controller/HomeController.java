package com.tasker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/create")
    public String index() {
        return "pages/create";
    }

    @GetMapping("/")
    public String list() {
        return "pages/list";
    }
}