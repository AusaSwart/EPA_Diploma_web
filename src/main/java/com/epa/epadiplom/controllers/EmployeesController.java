//package com.epa.epadiplom.controllers;
//
//import com.epa.epadiplom.repositories.*;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/api/v1/auth/")
//public class EmployeesController {
//    private final EmployeesViewRepo employeesViewRepo;
//    public EmployeesController(EmployeesViewRepo employeesViewRepo) {
//        this.employeesViewRepo = employeesViewRepo;
//    }
//
//    // Page w/ list of employees
//    //part of main features, where employee\admin can see all employees (5)
//    @GetMapping("/api/v1/auth/main/employees")
//    public String getEmployees( Model model ){
//        model.addAttribute("employees_view", employeesViewRepo.findAll());
//        return "api/v1/auth/main/employees";
//    }
//
//}