package com.epa.epadiplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MAINstartPageController {

    // Main page (temporary)
    @GetMapping("/api/v1/auth/main")
    public String getIndex(){
        return "api/v1/auth/main/index";
    }


}
