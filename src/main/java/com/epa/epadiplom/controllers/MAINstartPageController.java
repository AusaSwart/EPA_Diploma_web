package com.epa.epadiplom.controllers;

import com.epa.epadiplom.repositories.EmployeesViewRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MAINstartPageController {

    private final EmployeesViewRepo employeesViewRepo;
    public MAINstartPageController(EmployeesViewRepo employeesViewRepo) {
        this.employeesViewRepo = employeesViewRepo;
    }


    // Main page (temporary) it will be hello-page, after signing up or whatever
    // it will be page of employee, with main info n' main features (1)
    @GetMapping("/api/v1/auth/main/main_page")
    public String getIndex(){
        return "api/v1/auth/main/index";
    }



    // add more features + admin-page, but it will be depended on login
    // also need to take id of employee from login
    //part of main features, where employee\admin can see all employees (5)
    @GetMapping("/api/v1/auth/main/employees")
    public String getEmployees( Model model ){
        model.addAttribute("employees_view", employeesViewRepo.findAll());
        return "api/v1/auth/main/employees";
    }

}
