package com.example.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.HashMap;

@Controller
public class AjaxController {


    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "테스트입니다.";
    }

    @PostMapping("/getData")
    @ResponseBody
    @CrossOrigin("*")
    public Map<String, Object> getData(){
        //email, passwd, name, age
        Map<String, Object> map = new HashMap<>();
        map.put("email", "mail@mail.com");
        map.put("passwd", "1234");
        map.put("name", "홍길동");
        map.put("age", "20");
        return map;
    }

    @GetMapping("/setData")
    @ResponseBody
    @CrossOrigin("*")
    public Map<String, Object> setData(String code, String name){
        System.out.println(code);
        System.out.println(name);

        Map<String, Object> map = new HashMap<>();
        map.put("msg","success");

        return map;
    }


}
