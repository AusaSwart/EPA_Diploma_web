package com.epa.epadiplom.authentification.controllers;

import com.epa.epadiplom.models.entities.EmployeeFullView;
import com.epa.epadiplom.models.entities.EmployeesView;
import com.epa.epadiplom.models.entities.EventsView;
import com.epa.epadiplom.models.entities.LogStatementsView;
import com.epa.epadiplom.models.repositories.EmployeeFullViewRepo;
import com.epa.epadiplom.models.repositories.EmployeesViewRepo;
import com.epa.epadiplom.models.repositories.EventsViewRepo;
import com.epa.epadiplom.models.repositories.LogStatementsViewRepo;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@EnableMethodSecurity
@EnableWebMvc
public class MainPageController {

    private final EmployeesViewRepo employeesViewRepo;
    private final EmployeeFullViewRepo employeeFullViewRepo;
    private final EventsViewRepo eventsViewRepo;
    private final LogStatementsViewRepo logStatementViewRepo;

    public MainPageController(EmployeesViewRepo employeesViewRepo,
                              EmployeeFullViewRepo employeeFullViewRepo,
                              EventsViewRepo eventsViewRepo,
                              LogStatementsViewRepo logStatementViewRepo) {
        this.employeesViewRepo = employeesViewRepo;
        this.employeeFullViewRepo = employeeFullViewRepo;
        this.eventsViewRepo = eventsViewRepo;
        this.logStatementViewRepo = logStatementViewRepo;
    }

    // Here's we have a main full info of logged employee
    @GetMapping(path = "main/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeeFullView> getEmployeeInfo(){
        return this.employeeFullViewRepo.findAllByIdLogin(1000000L);
        //mb problem is that there's some mistakes in filterChain or smth
    }

    // There's function of showing all info
    @GetMapping(path = "main/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees() {
        return this.employeesViewRepo.findAll();
    }




    // ls-requests
    @GetMapping(path = "main/ls", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<LogStatementsView> getLsRequests() {
        return this.logStatementViewRepo.findAllByIdApproverAndApprove(1000000L, 3);
        // change id on auth empl
        // 1 - yes
        // 2 - no
        // 3 - need to be approved
    }
//    // do response for ls-requests
//    @PostMapping(path = "main/ls", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody String getLsResponse() {
//        return this.logStatementRepo.save();
//    }

    // events
    @GetMapping(path = "main/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EventsView> getEvents() {
        return this.eventsViewRepo.findAllByIdRecipient(1000000L);
        // change id on auth empl
        // add filter. if event has old date then don't show it
    }





    //perhaps this part I need for userDetails\authorization. but it's doesn't certain

    //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    //System.out.println(auth.getPrincipal().toString());
    //User user = userRepo.findByFirstName(auth.getName()).orElseThrow();
    //return employeeFullViewRepo.findById(login.getId_login());
}
