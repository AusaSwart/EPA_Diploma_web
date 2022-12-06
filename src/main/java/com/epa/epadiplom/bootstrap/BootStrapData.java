package com.epa.epadiplom.bootstrap;

import com.epa.epadiplom.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ContactRepo contactRepo;
    private final DepartmentRepo departmentRepo;
    private final DocumentRepo documentRepo;
    private final EmployeeRepo employeeRepo;
    private final EmployeeTaskRepo employeeTaskRepo;
    private final EventRepo eventRepo;
    private final JobEmployeeRepo jobEmployeeRepo;
    private final JobTitleRepo jobTitleRepo;
    private final LoginRepo loginRepo;
    private final LogStatementRepo logStatementRepo;
    private final MainInfoRepo mainInfoRepo;
    private final NoticeEventRepo noticeEventRepo;
    private final TaskRepo taskRepo;

    public BootStrapData(ContactRepo contactRepo, DepartmentRepo departmentRepo,
                         DocumentRepo documentRepo, EmployeeRepo employeeRepo,
                         EmployeeTaskRepo employeeTaskRepo, EventRepo eventRepo,
                         JobEmployeeRepo jobEmployeeRepo, JobTitleRepo jobTitleRepo,
                         LoginRepo loginRepo, LogStatementRepo logStatementRepo,
                         MainInfoRepo mainInfoRepo, NoticeEventRepo noticeEventRepo,
                         TaskRepo taskRepo) {
        this.contactRepo = contactRepo;
        this.departmentRepo = departmentRepo;
        this.documentRepo = documentRepo;
        this.employeeRepo = employeeRepo;
        this.employeeTaskRepo = employeeTaskRepo;
        this.eventRepo = eventRepo;
        this.jobEmployeeRepo = jobEmployeeRepo;
        this.jobTitleRepo = jobTitleRepo;
        this.loginRepo = loginRepo;
        this.logStatementRepo = logStatementRepo;
        this.mainInfoRepo = mainInfoRepo;
        this.noticeEventRepo = noticeEventRepo;
        this.taskRepo = taskRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Bootstrap starting");
        System.out.println(" Num of tasks " + taskRepo.count());
    }
}
