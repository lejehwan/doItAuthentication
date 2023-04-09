package com.example.doItAuthentication.controller;

import com.example.doItAuthentication.domain.Member;
import com.example.doItAuthentication.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("members/new")
    public String createMemberFrom(Model model){
        model.addAttribute("memberForm", new MemberForm());
        return "members/createMemberForm";
    }

    @PostMapping("members/new")
    public String createMember(@Valid MemberForm form){
        Member member = Member.builder()
                .userName(form.getName())
                .password(form.getPw())
                .build();
        memberService.join(member);
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
