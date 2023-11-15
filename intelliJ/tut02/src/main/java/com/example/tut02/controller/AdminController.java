package com.example.tut02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {
    //index, emp, arti
    @GetMapping("")
    public String getIndex(){
        return "admin/index";
    }

    @GetMapping("/employees")
    public String getEmployees(){
        return "admin/employees";
    }

    @GetMapping("/article")
    public String getArticle(){
        return "admin/article";
    }
}
