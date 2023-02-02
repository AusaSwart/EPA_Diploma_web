package com.epa.epadiplom.controllers;

import com.epa.epadiplom.repositories.TaskRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    private final TaskRepo taskRepo;
    public TaskController(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    // List of tasks (temporary)
    @GetMapping("/tasks")
    private String getTasks(Model model){
        model.addAttribute("tasks", taskRepo.findAll());
        return "task/listall";
    }
}
