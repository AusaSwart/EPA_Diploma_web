//package com.epa.epadiplom.controllers;
//
//import com.epa.epadiplom.models.entities.Login;
//import com.epa.epadiplom.models.service.LoginService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.MediaType;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Objects;
//
//
//@RestController
//@RequestMapping("/auth")
//@RequiredArgsConstructor
//public class AuthController {
//    private LoginService service;
//
//    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody com.epa.epadiplom.models.entities.Login getAuthUser() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth == null) {
//            return null;
//        }
//        Object principal = auth.getPrincipal();
//        Login user = (principal instanceof Login) ? (Login) principal : null;
//        return Objects.nonNull(user) ? this.service.getByLogin(user.getUsername()) : null;
//    }
//}



// Main page (temporary) it will be hello-page, after signing up or whatever
// it will be page of employee, with main info n' main features (1)
//    @GetMapping("/main/main_page")
//    public String getMain(Model model){
//final JwtAuthentication authInfo = authService.getAuthInfo();
//loginRepo.findByLogin(authInfo.getPrincipal());
//long id = loginRepo.findByLogin(authInfo.getPrincipal()).get().getId_login();
//ResponseEntity.ok("Hello user " + authInfo.getPrincipal() + "!");
//model.addAttribute("employees_view", employeeFullViewRepo.findById(id));
//        return "main/main";
//    }

// add more features + admin-page, but it will be depended on login
// also need to take id of employee from login
//part of main features, where employee\admin can see all employees (5)
//    @GetMapping("/main/employees")
//    public String getEmployees( Model model ){
//        model.addAttribute("employees_view", employeesViewRepo.findAll());
//        return "main/employees";
//    }
