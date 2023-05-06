package com.epa.epadiplom.controller;

import com.epa.epadiplom.entity.*;
import com.epa.epadiplom.entity.authentication.*;
import com.epa.epadiplom.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
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
    private final LogStatementService logStatementService;
    private final EventService eventService;
    private final NoticeEventService noticeEventService;
    private final TaskService taskService;
    private final EmployeeTaskService employeeTaskService;
    private final PasswordEncoder passwordEncoder;
    private final DocumentService documentService;

    // _______________________________________________________
    // Request to see the main info of authorized employee page
    @GetMapping(path = "/mainUserInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeFullView>> getEmployeeInfo(Authentication authentication) {
        return ResponseEntity.ok(employeeFullViewService.findAllByLoginUser(authentication.getName()));
    }

    // _______________________________________________________
    // Request to see the statements that need to approve
    @GetMapping(path = "/ls", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LogStatementsView>> getLsRequests(Authentication authentication) {
        return ResponseEntity.ok(this.logStatementsViewService.findAllByIdApproverAndStatus(
                userService.findUserByFirstName(authentication.getName()).getIdLogin(), 3));
    }

//     Request to approve the statements
    @PostMapping(path = "/ls/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> setLsApprove(
            @PathVariable Long id,
            Authentication authentication,
            @RequestBody LogStatementRequest request
    ) {
        LogStatement logStatement = logStatementService.findByIdAndIdApprover(
                id,
                userService.findUserByFirstName(authentication.getName()).getIdLogin()
                ).orElse(new LogStatement());
        logStatement.setStatus(request.getStatus());
        System.out.println(logStatement.getId() + "    " +
                logStatement.getStatus());
        if(logStatementService.saveLogStatement(logStatement))
            System.out.println("ok");
        return ResponseEntity.ok("Done ");
    }

    // Request to see the events for authorized employee
    @GetMapping(path = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EventsView> getEvents(Authentication authentication) {
        return this.eventsViewService.findAllByIdRecipient(
                userService.findUserByFirstName(authentication.getName()).getIdLogin());
    }

    // Request to see the tasks for authorized employee
    @GetMapping(path = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<TasksView> getTasks(Authentication authentication) {
            System.out.println(authentication);
        return this.tasksViewService.findAllByIdExecutor(
                userService.findUserByFirstName(authentication.getName()).getIdLogin());
    }

    // _______________________________________________________
    // Request for seeing list of all employees
    @GetMapping(path = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<EmployeesView> getEmployees() {
        return this.employeesViewService.findAll();
    }



    @PostMapping(path = "/event", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createEvent(@RequestBody EventRequest request) {
        Event event = Event.builder()
                .dateOfEvent(request.getDateOfEvent())
                .commentFe(request.getCommentFe())
                .typeOfEvent(request.getTypeOfEvent())
                .build();
        if(eventService.saveEvent(event))
            System.out.println("ok");
        return ResponseEntity.ok("Done");
    }

    @PostMapping(path = "/noticeevent/{idevent}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createNoticeEvent(
            @RequestBody NoticeEventRequest request,
            Authentication authentication,
            @PathVariable Long idevent
    ) {
        NoticeEvent noticeEvent = NoticeEvent.builder()
                .recipientId(request.getRecipientId())
                .eventId(idevent)
                .employeeId(userService.findUserByFirstName(authentication.getName()).getIdLogin())
                .build();
        System.out.println(noticeEvent.getRecipientId() + "   " +
                noticeEvent.getEventId() + "  " +
                noticeEvent.getEmployeeId());
        if(noticeEventService.saveNoticeEvent(noticeEvent))
            System.out.println("ok");
        return ResponseEntity.ok("Done");
    }

    @PostMapping(path = "/task", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createTask(@RequestBody TaskRequest request) {
        Task task = Task.builder()
                .dateTask(request.getDateTask())
                .nameOfTask(request.getNameOfTask())
                .idExecutor(request.getIdExecutor())
                .commentTe(request.getCommentTe())
                .build();
        System.out.println(task.getId());
        EmployeeTask employeeTask = EmployeeTask.builder()
                .idTask(task.getId())
                .idEmployee(request.getIdExecutor())
                .build();
        if (taskService.saveTask(task))
            System.out.println("ok");
        if (employeeTaskService.saveEmployeeTask(employeeTask))
            System.out.println("ok");
        return ResponseEntity.ok("Done");
    }

    @PostMapping(path = "/password", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> changePassword(@RequestBody LoginRequest request,
                                              Authentication authentication) {
        User user = userService.findUserByFirstName(authentication.getName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        if (userService.saveUserPassword(user))
            System.out.println("ok");
        return ResponseEntity.ok("Done");
    }

    @PostMapping(path = "/lscreate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createLS( @RequestBody LogStatementCreateRequest request,
                                            Authentication authentication
                                            ){
        LogStatement logStatement = LogStatement.builder()
                .id(0)
                .idApprover(request.getIdApprover())
                .status(3)
                .idEmployee(userService.findUserByFirstName(authentication.getName()).getIdLogin())
                .commentLs(request.getCommentLs())
                .typeLeave(request.getTypeLeave())
                .dateLeave(request.getDateLeave())
                .dateOfLs(request.getDateOfLs())
                .daysSum(request.getDaysSum())
                .build();
        if(logStatementService.saveLogStatementAll(logStatement))
            System.out.println("ok");
        if(request.getBodyDoc()!= null) {
            Document document = Document.builder()
                    .bodyDoc(request.getBodyDoc())
                    .idLs(logStatement.getId())
                    .build();
            if(documentService.saveDocument(document))
                System.out.println("ok");
        }
        return ResponseEntity.ok("Done ");
    }


}
