package com.example.doItAuthentication.respository;

import com.example.doItAuthentication.domain.Member;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findMember(Long id){
        return em.find(Member.class, id);
    }
}
