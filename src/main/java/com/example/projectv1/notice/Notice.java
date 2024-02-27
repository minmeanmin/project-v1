package com.example.projectv1.notice;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Table(name="notice_tb")
@Data
@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String companyName;

    @Column(length = 45)
    private String field;

    @Column(length = 45)
    private String area;

    @Column(length = 45)
    private String address;

    @Column(length = 45)
    private String career;

    @Column(length = 45)
    private String employmentType;

    @Column(length = 45)
    private String money;

    private String details;

    private LocalDateTime deadlineDate;
    private Timestamp createdAt;
}
