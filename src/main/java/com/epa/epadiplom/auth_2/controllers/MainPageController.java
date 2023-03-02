//package com.epa.epadiplom.controllers;
//
//import com.epa.epadiplom.auth.AuthenticationService;
//import com.epa.epadiplom.config.JwtAuthenticationFilter;
//import com.epa.epadiplom.domainService.JwtService;
//import com.epa.epadiplom.models.entities.EmployeesView;
//import com.epa.epadiplom.models.entities.Login;
//import com.epa.epadiplom.models.repositories.EmployeeFullViewRepo;
//import com.epa.epadiplom.models.repositories.EmployeesViewRepo;
//import com.epa.epadiplom.models.repositories.LoginRepo;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.http.MediaType;
//import org.springframework.lang.NonNull;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import java.util.List;
//
//@RestController
//@EnableMethodSecurity
//@EnableWebMvc
////@RequestMapping("/")
//public class MainPageController {
//
//    private final EmployeesViewRepo employeesViewRepo;
//    private final EmployeeFullViewRepo employeeFullViewRepo;
//    private final UserDetailsService userDetailsService;
//    private final JwtAuthenticationFilter jwtAuthenticationFilter;
//    private final JwtService jwtService;
//    private final LoginRepo loginRepo;
//
//
//    public MainPageController(EmployeesViewRepo employeesViewRepo,
//                              EmployeeFullViewRepo employeeFullViewRepo,
//                              UserDetailsService userDetailsService,
//                              AuthenticationService authenticationService, JwtAuthenticationFilter jwtAuthenticationFilter, JwtService jwtService,
//                              LoginRepo loginRepo) {
//        this.employeesViewRepo = employeesViewRepo;
//        this.employeeFullViewRepo = employeeFullViewRepo;
//        this.userDetailsService = userDetailsService;
//        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
//        this.jwtService = jwtService;
//        this.loginRepo = loginRepo;
//    }
//
//
//
//    // Here's we have a main full info of logged employee
//    @GetMapping(path = "main/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody Object getMain(){
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        System.out.println(auth.getPrincipal().toString());
//
//        Login login = loginRepo.findByLogin(auth.getName()).orElseThrow();
//        return "ok";
//        //return employeeFullViewRepo.findById(login.getId_login());
//    }
//
//
//    // There's function of showing all info
//    @GetMapping(path = "main/employees", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody List<EmployeesView> getEmployees(  ) {
//        return this.employeesViewRepo.findAll();
//    }
//
//
//
//}
