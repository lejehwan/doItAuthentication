//package com.example.doItAuthentication.service;
//
//import com.example.doItAuthentication.domain.Member;
//import com.example.doItAuthentication.respository.MemberRepository;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//class MemberServiceTest {
//
//    @Autowired
//    MemberRepository memberRepository;
//    @Autowired
//    MemberService memberService;
//
//    @Test
//    @DisplayName("회원가입 테스트")
//    public void join() {
//        Member member = Member.builder()
//                .userName("ljh")
//                .password("1234")
//                .build();
//
//        Long savedId = memberService.join(member);
//
//        assertThat(member).isEqualTo(memberRepository.findMember(savedId));
//    }
//}