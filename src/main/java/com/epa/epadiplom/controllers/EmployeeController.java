package com.epa.epadiplom.controllers;

import com.epa.epadiplom.repositories.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    public final EmployeeRepo employeeRepo;
    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @RequestMapping("/employees")
    public String getEmployees(Model model){
        model.addAttribute("employees", employeeRepo.findAll());
        return "employee/listall";
    }


}
