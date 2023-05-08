package com.example.doItAuthentication.service;

import com.example.doItAuthentication.domain.Member;
import com.example.doItAuthentication.respository.MemberRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public @NotNull Long join(Member member){
        memberRepository.save(member);
        return member.getUserSeq();
    }

    public Member findMember(Long id){
        return memberRepository.findMember(id);
    }
}
