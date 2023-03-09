package com.epa.epadiplom.authentification.controllers;

import com.epa.epadiplom.models.entities.EmployeeFullView;
import com.epa.epadiplom.models.entities.EmployeesView;
import com.epa.epadiplom.models.repositories.EmployeeFullViewRepo;
import com.epa.epadiplom.models.repositories.EmployeesViewRepo;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@EnableMethodSecurity
@EnableWebMvc
//@RequestMapping("/")
public class MainPageController {

    private final EmployeesViewRepo employeesViewRepo;
    private final EmployeeFullViewRepo employeeFullViewRepo;

    public MainPageController(EmployeesViewRepo employeesViewRepo,
                              EmployeeFullViewRepo employeeFullViewRepo
                              ) {
        this.employeesViewRepo = employeesViewRepo;
        this.employeeFullViewRepo = employeeFullViewRepo;
    }

    // Here's we have a main full info of logged employee
    @GetMapping(path = "main/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeeFullView> getEmployeeInfo(){
        return this.employeeFullViewRepo.findAllByIdLogin(1000000L);
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //System.out.println(auth.getPrincipal().toString());
        //User user = userRepo.findByFirstName(auth.getName()).orElseThrow();
        //return employeeFullViewRepo.findById(login.getId_login());
    }


    // There's function of showing all info
    @GetMapping(path = "main/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees() {
        return this.employeesViewRepo.findAll();
    }



}
