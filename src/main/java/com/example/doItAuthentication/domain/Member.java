package com.example.doItAuthentication.domain;

import jakarta.persistence.*;
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
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false, length = 20)
    private String userName;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(/*nullable = false, */length = 20)
    private String email;

    @CreationTimestamp
    private Timestamp createDate;

    @Builder
    public Member(String userName, String password, String email, Timestamp createDate) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.createDate = createDate;
    }
}
