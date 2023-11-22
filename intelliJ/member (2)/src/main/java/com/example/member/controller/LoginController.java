package com.example.member.controller;

import com.example.member.dto.MemberDto;
import com.example.member.mappers.MemberMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    MemberMapper memberMapper;

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String setLogin(
            @ModelAttribute MemberDto memberDto,
            RedirectAttributes ra,
            HttpServletRequest hsr) {

        MemberDto m = memberMapper.setLogin(memberDto);
        if( m != null ) {
            HttpSession hs = hsr.getSession();
            hs.setAttribute("user", m);
            hs.setMaxInactiveInterval(10 * 60);

            return "redirect:/member";

        }else{
            ra.addFlashAttribute("message", "아이디/비밀번호를 확인하세요.");
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String getLogout(HttpSession hs) {
        hs.invalidate();
        return "redirect:/login";
    }

}
