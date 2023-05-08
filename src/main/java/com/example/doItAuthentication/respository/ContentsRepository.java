package com.example.doItAuthentication.respository;

import com.example.doItAuthentication.domain.Contents;
import com.example.doItAuthentication.domain.Member;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContentsRepository {

    private final EntityManager em;

    public List<Contents> findContents(){
        return em.createQuery("select c from Contents c", Contents.class)
                .getResultList();
    }

    public Contents findOne(String id) {
        return em.find(Contents.class, id);
    }
}
