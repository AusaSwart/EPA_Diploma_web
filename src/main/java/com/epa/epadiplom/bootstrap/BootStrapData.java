//package com.epa.epadiplom.bootstrap;
//
//import com.epa.epadiplom.repositories.*;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class BootStrapData implements CommandLineRunner {
//
//    private final EmployeeRepo employeeRepo;
//    private final LoginRepo loginRepo;
//
//    public BootStrapData( EmployeeRepo employeeRepo,
//                          LoginRepo loginRepo) {
//        this.employeeRepo = employeeRepo;
//        this.loginRepo = loginRepo;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
////        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();  // хеширование паролей
////        System.out.println(encoder.encode("student"));
//
//        //System.out.println(employeeRepo.findAll());
//        System.out.println("Bootstrap started");
//        //System.out.println(" Num of employees " + employeeRepo.count());
//    }
//}
