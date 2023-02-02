//package com.epa.epadiplom.controllers;
//
//import com.epa.epadiplom.repositories.MainInfoRepo;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class MainInfoController {
//
//
//    // Addictional info for employees page
//    @RequestMapping("/employees")
//    public String getEmployees(Model model){
//        model.addAttribute("employeesMainInfo", mainInfoRepo.findAll());
//        return "employee/listall";
//    }
//}
