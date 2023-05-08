package com.example.doItAuthentication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTENTS_SEQ")
    private Long contentsSeq;

    @Column(name = "LIST_ID", length = 100)
    private String listId;

    @Lob
    @Column(name = "CONTENTS")
    private String contents;
}
