package com.epa.epadiplom.controllers;

import com.epa.epadiplom.repositories.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeesController {
    private final EmployeesViewRepo employeesViewRepo;
    public EmployeesController(EmployeesViewRepo employeesViewRepo) {
        this.employeesViewRepo = employeesViewRepo;
    }

    // Page w/ list of employees
    @RequestMapping("/api/v1//employees")
    public String getEmployees( Model model ){
        model.addAttribute("employees_view", employeesViewRepo.findAll());
        return "api/v1/employee/listall";
    }

}