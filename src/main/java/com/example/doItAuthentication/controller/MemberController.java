package com.example.doItAuthentication.controller;

import com.example.doItAuthentication.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MemberController {

    @GetMapping("members/new")
    public String createMemberFrom(Model model){
        model.addAttribute("memberForm", new Member());
        return "members/createMemberForm";
    }

    @PostMapping("members/new")
    public String createMember(){
        //TODO

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("LoginForm", new LoginForm());
        return "/members/loginForm";
    }

    @PostMapping("/login")
    public String login(LoginForm loginForm){
        log.info(loginForm.getName());
        return "redirect:/";
    }

}
