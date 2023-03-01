package com.epa.epadiplom.controllers;

import com.epa.epadiplom.config.ApplicationConfig;
import com.epa.epadiplom.models.entities.EmployeesView;
import com.epa.epadiplom.models.entities.Login;
import com.epa.epadiplom.models.repositories.EmployeeFullViewRepo;
import com.epa.epadiplom.models.repositories.EmployeesViewRepo;
import com.epa.epadiplom.models.repositories.LoginRepo;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.security.Principal;
import java.util.List;

@RestController
@EnableMethodSecurity
@EnableWebMvc
//@RequestMapping("/")
public class MainPageController {

    private final EmployeesViewRepo employeesViewRepo;
    private final EmployeeFullViewRepo employeeFullViewRepo;
    private final UserDetailsService userDetailsService;

    public MainPageController(EmployeesViewRepo employeesViewRepo,
                              EmployeeFullViewRepo employeeFullViewRepo,
                              UserDetailsService userDetailsService) {
        this.employeesViewRepo = employeesViewRepo;
        this.employeeFullViewRepo = employeeFullViewRepo;
        this.userDetailsService = userDetailsService;

    }



    // Here's we have a main full info of logged employee
    @GetMapping(path = "/main/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Object getMain(Principal principal){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            return auth.getName();
        }
        System.out.println("___ -- ___" + principal.getName());
        //authentication.getPrincipal();
        //System.out.println(user.getUsername());
        return "hi" ;//employeeFull ViewRepo.findById(login.getId_login());
    }


    // There's function of showing all info
    @GetMapping(path = "/main/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees(  ) {
        return this.employeesViewRepo.findAll();
    }



}
