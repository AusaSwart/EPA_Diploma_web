package com.epa.epadiplom.controllers;

import com.epa.epadiplom.repositories.EmployeeRepo;
import com.epa.epadiplom.repositories.MainInfoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    public final EmployeeRepo employeeRepo;
    public final MainInfoRepo mainInfoRepo;

    public EmployeeController(EmployeeRepo employeeRepo, MainInfoRepo mainInfoRepo) {
        this.employeeRepo = employeeRepo;
        this.mainInfoRepo = mainInfoRepo;
    }


    // Page w/ list of employees
    @RequestMapping("/employees")
    public String getEmployees(Model model, Model model1){
        model.addAttribute("employees", employeeRepo.findAll());
        model1.addAttribute("employeesMainInfo", mainInfoRepo.findAll());
        return "employee/listall";
    }


}
