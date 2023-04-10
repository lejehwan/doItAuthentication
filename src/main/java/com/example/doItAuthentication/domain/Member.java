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

    @Column(name = "USER_ID", length = 64, unique = true)
    @NotNull
    private String userId;

    @Column(name = "USER_NAME", length = 100)
    @NotNull
    private String userName;

    @Column(name = "PASSWORD", length = 128)
    @NotNull
    private String password;

    @Column(name = "ROLE_TYPE", length = 20)
    @Enumerated(EnumType.STRING)
    @NotNull
    private RoleType roleType;

    @Column(name = "EMAIL", length = 512, unique = true)
    @NotNull
    private String email;

    @Column(name = "CREATED_DATE")
    @CreationTimestamp
    @NotNull
    private Timestamp createDate;

    @Builder
    public Member(@NotNull String userId, @NotNull String userName, @NotNull String email,
                  @NotNull RoleType roleType, Timestamp createDate) {
        this.userId = userId;
        this.userName = userName;
        this.password = "NO_PASS";
        this.email = email;
        this.roleType = roleType;
        this.createDate = createDate;
    }
}
