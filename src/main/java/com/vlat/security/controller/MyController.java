package com.vlat.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @GetMapping("/welcome")
    public String mainPage(){
        return "main";
    }
    @GetMapping("/main")
    public String mainAuth(){
        return "main-auth";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/employee")
    public String employee(){
        return "employee";
    }
}
