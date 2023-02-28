package com.epa.epadiplom.controllers;

import com.epa.epadiplom.models.entities.EmployeesView;
import com.epa.epadiplom.models.entities.Login;
import com.epa.epadiplom.models.repositories.EmployeeFullViewRepo;
import com.epa.epadiplom.models.repositories.EmployeesViewRepo;
import com.epa.epadiplom.models.repositories.LoginRepo;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@EnableMethodSecurity
@EnableWebMvc
//@RequestMapping("/")
public class MainPageController {

    private final EmployeesViewRepo employeesViewRepo;
    private final EmployeeFullViewRepo employeeFullViewRepo;
    private final LoginRepo loginRepo;

    public MainPageController(EmployeesViewRepo employeesViewRepo,
                              EmployeeFullViewRepo employeeFullViewRepo,
                              LoginRepo loginRepo) {
        this.employeesViewRepo = employeesViewRepo;
        this.employeeFullViewRepo = employeeFullViewRepo;
        this.loginRepo = loginRepo;
    }



    // Here's we have a main full info of logged employee
    @GetMapping(path = "/main/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Object getMain(Authentication authentication){
        //System.out.println(authentication.getPrincipal());
        return "hi" ;//employeeFullViewRepo.findById(login.getId_login());
    }


    // There's function of showing all info
    @GetMapping(path = "/main/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees(  ) {
        return this.employeesViewRepo.findAll();
    }



}
