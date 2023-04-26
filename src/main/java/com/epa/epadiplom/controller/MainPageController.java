package com.epa.epadiplom.controller;

import com.epa.epadiplom.entity.EmployeeFullView;
import com.epa.epadiplom.entity.EmployeesView;
import com.epa.epadiplom.entity.EventsView;
import com.epa.epadiplom.entity.LogStatementsView;
import com.epa.epadiplom.repository.EmployeeFullViewRepository;
import com.epa.epadiplom.repository.EmployeesViewRepository;
import com.epa.epadiplom.repository.EventsViewRepository;
import com.epa.epadiplom.repository.LogStatementsViewRepository;
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
    private final EmployeesViewRepository employeesViewRepository;
    private final EmployeeFullViewRepository employeeFullViewRepository;
    private final LogStatementsViewRepository logStatementsViewRepository;
    private final EventsViewRepository eventsViewRepository;

    @GetMapping(path = "main/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeeFullView> getEmployeeInfo(Authentication authentication) {
        return employeeFullViewRepository.findAllByLoginUser(authentication.getName());
    }

    @GetMapping(path = "main/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees() {
        return this.employeesViewRepository.findAll();
    }

    @GetMapping(path = "main/ls", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<LogStatementsView> getLsRequests(Authentication authentication) {
        return this.logStatementsViewRepository.findAllByIdApproverAndApprove(1000000L, 3);
    }

    @GetMapping(path = "main/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EventsView> getEvents(Authentication authentication) {
        return this.eventsViewRepository.findAllByIdRecipient(1000000L);
    }
}
