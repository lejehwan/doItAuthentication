package com.example.doItAuthentication.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_SEQ")
    private Long userSeq;

    @Column(name = "USER_NAME", length = 100)
    private String userName;

    @Column(name = "PASSWORD", length = 128)
    private String password;

    @Column(name = "CREATED_DATE")
    @CreationTimestamp
    private Timestamp createDate;

    public Member(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
