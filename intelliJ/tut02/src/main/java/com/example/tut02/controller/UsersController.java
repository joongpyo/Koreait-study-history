package com.example.tut02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsersController {

    //login
    @GetMapping("/login")
    public String getLogin(){

        return "users/login";
    }

    //register
    @GetMapping("/register")
    public String getRegister(){

        return "users/register";
    }

    //ajax -> data -> responsebody
    @GetMapping("/getAjax")
    @ResponseBody
    public Map<String, Object> getAjax(){
        //자료 전송하는 방법 List(순서가 있는 배열(선형),Map(키, 값(동적배열))
        Map<String, Object> map = new HashMap<>();
        map.put("userid","koreait");
        map.put("passwd","1234");
        return map;
    }
    @PostMapping("/setAjax")
    @ResponseBody
    public Map<String, Object> setAjax(@RequestParam String userid, @RequestParam String passwd){
        System.out.println(userid);
        System.out.println(passwd);

        Map<String, Object> map = new HashMap<>();
        if(userid !=null ){

            map.put("msg", "성공적으로 데이터가 전송되었습니다.");

        }

        return map;
    }

}
