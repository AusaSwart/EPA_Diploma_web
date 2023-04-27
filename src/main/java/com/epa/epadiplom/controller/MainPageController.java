package com.epa.epadiplom.controller;

import com.epa.epadiplom.entity.EmployeeFullView;
import com.epa.epadiplom.entity.EmployeesView;
import com.epa.epadiplom.entity.EventsView;
import com.epa.epadiplom.entity.LogStatementsView;
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
    private final UserService userService;

    @GetMapping(path = "/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeeFullView> getEmployeeInfo(Authentication authentication) {
        return employeeFullViewService.findAllByLoginUser(authentication.getName());
    }

    @GetMapping(path = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees() {
        return this.employeesViewService.findAll();
    }

    @GetMapping(path = "/ls", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<LogStatementsView> getLsRequests(Authentication authentication) {
        return this.logStatementsViewService.findAllByIdApproverAndApprove(
                userService.findUserByFirstName(authentication.getName()).getIdLogin(), 3);
    }

    @GetMapping(path = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EventsView> getEvents(Authentication authentication) {
        return this.eventsViewService.findAllByIdRecipient(
                userService.findUserByFirstName(authentication.getName()).getIdLogin());
    }
}
