package com.epa.epadiplom.controllers;

import com.epa.epadiplom.models.entities.EmployeesView;
import com.epa.epadiplom.models.entities.Login;
import com.epa.epadiplom.models.repositories.EmployeesViewRepo;
import com.epa.epadiplom.models.repositories.LoginRepo;
import com.epa.epadiplom.models.service.LoginService;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@EnableMethodSecurity
@RequestMapping("/")
public class MainPageController {

    private final EmployeesViewRepo employeesViewRepo;
    private final LoginRepo loginRepo;
    private LoginService service;

    public MainPageController(EmployeesViewRepo employeesViewRepo,
                              LoginRepo loginRepo) {
        this.employeesViewRepo = employeesViewRepo;
        this.loginRepo = loginRepo;
    }

    @GetMapping(path ="/main/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees(  ) {
        return this.employeesViewRepo.findAll();
    }


    @GetMapping(path = "/main/main_page", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Object getMain(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            return null;
        }
        Object principal = auth.getPrincipal();
        Login user = (principal instanceof Login) ? (Login) principal : null;
        return Objects.nonNull(user) ? this.service.getByLogin(user.getUsername()) : null;
    }




}
