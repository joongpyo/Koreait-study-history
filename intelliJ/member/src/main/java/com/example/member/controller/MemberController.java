package com.example.member.controller;

import com.example.member.dto.MemberDto;
import com.example.member.mappers.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberMapper memberMapper;

    @GetMapping("")
    public String getMemberList(Model model, @RequestParam(defaultValue = "") String searchType, @RequestParam(defaultValue = "") String words){
//        System.out.println(searchType);
//        System.out.println(words);

        String queryString = "";
        if(searchType.equals("userid")){
            queryString = "where userid = '"+words+"'";
        }else if(searchType.equals("username")){
            queryString = "where username = '"+words+"'";
        }else{
            queryString = "";
        }
//        System.out.println(queryString);

        model.addAttribute("cnt",memberMapper.getMemberCount(queryString));
        model.addAttribute("mem",memberMapper.getMemberList(queryString));
        memberMapper.getMemberList(queryString);
        return "member/list";
    }

    @GetMapping("/insert")
    public String getInsert(){
        return "member/insert";
    }

    @PostMapping("/insert")
    public String setInsert(@ModelAttribute MemberDto memberDto, RedirectAttributes ra){
        memberMapper.setInsert(memberDto);
        //post타입: 주소에 드러나지 않음
        //model.attribute -> get방식
        ra.addFlashAttribute("message","회원가입이 완료되었습니다.");
        return "redirect:/member";
    }

    @GetMapping("/delete")
    public String deleteMember(@RequestParam int id, RedirectAttributes ra){
        memberMapper.deleteMember(id);
        ra.addFlashAttribute("message","회원정보 삭제가 완료 되었습니다.");
        return "redirect:/member";
    }

    @GetMapping("/view")
    public String viewMember(@RequestParam int id, Model model){
        model.addAttribute("mem", memberMapper.viewMember(id));
        memberMapper.viewMember(id);
        return "member/view";
    }

}
