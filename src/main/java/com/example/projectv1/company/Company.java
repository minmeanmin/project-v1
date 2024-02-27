package com.example.projectv1.company;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name="company_tb")
@Data
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String nickname;

    @Column(length = 32)
    private String password;

    @Column(length = 16)
    private String companyName;

    @Column(length = 11)
    private String companyNum;

    private String email;
    private String photo;

    private Timestamp createdTime;
}

