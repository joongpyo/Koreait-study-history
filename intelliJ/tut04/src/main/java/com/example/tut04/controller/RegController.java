package com.example.tut04.controller;

import com.example.tut04.dto.RegDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegController {
    @GetMapping("/users/register")
    public String getReg(){
        return "users/register";
    }

    @PostMapping("/users/register")
    @ResponseBody
    public Map<String, Object> setReg(@ModelAttribute RegDto obj){
        System.out.println(obj.toString());


        Map<String, Object> map = new HashMap<>();
//        if(obj != null){
//            map.put("msg","회원정보가 전송되었습니다.");
//        }

        //200(ok), 500 (서버에러)
        map.put("status","200");
        map.put("msg","데이터가 전송되었습니다");

        return map;
    }


}
