package com.epa.epadiplom.bootstrap;

import com.epa.epadiplom.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final EmployeeRepo employeeRepo;

    public BootStrapData( EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(employeeRepo.findAll());
        System.out.println("Bootstrap started");
        System.out.println(" Num of employees " + employeeRepo.count());
    }
}
