package com.epa.epadiplom.controller;

import com.epa.epadiplom.entity.*;
import com.epa.epadiplom.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@EnableMethodSecurity
@EnableWebMvc
@RequiredArgsConstructor
public class MainPageController {
    private final EmployeesViewService employeesViewService;
    private final EmployeeFullViewService employeeFullViewService;
    private final LogStatementsViewService logStatementsViewService;
    private final EventsViewService eventsViewService;
    private final TasksViewService tasksViewService;
    private final UserService userService;

    // _______________________________________________________
    // Request to see the main info of authorized employee page
    @GetMapping(path = "/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeeFullView> getEmployeeInfo(Authentication authentication) {
        return employeeFullViewService.findAllByLoginUser(authentication.getName());
    }

    // _______________________________________________________
    // Request to see the statements that need to approve
    @GetMapping(path = "/ls", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<LogStatementsView> getLsRequests(Authentication authentication) {
        return this.logStatementsViewService.findAllByIdApproverAndStatus(
                userService.findUserByFirstName(authentication.getName()).getIdLogin(), 3);
    }

    // Request to approve the statements
//    @PostMapping(path = "/ls/{id_ls}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody List<LogStatement> setLsApprove(Authentication authentication) {
//        return this.logStatementService. (id_ls, approve);
//    }

    // Request to employee info by Id
//    @GetMapping(path = "/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody List<EventsView> getEvents(Authentication authentication) {
//        return this.eventsViewService.findAllByIdRecipient(id);
//    }

    // Request to see the events for authorized employee
    @GetMapping(path = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EventsView> getEvents(Authentication authentication) {
        return this.eventsViewService.findAllByIdRecipient(
                userService.findUserByFirstName(authentication.getName()).getIdLogin());
    }

    // Request to see the tasks for authorized employee
    @GetMapping(path = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<TasksView> getTasks(Authentication authentication) {
        return this.tasksViewService.findAllByIdExecutor(
                userService.findUserByFirstName(authentication.getName()).getIdLogin());
    }

    // _______________________________________________________
    // Request for seeing list of all employees
    @GetMapping(path = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees() {
        return this.employeesViewService.findAll();
    }

}
