package com.example.projectv1.user.education;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name="education_tb")
@Data
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String agency;

    @Column(length = 45)
    private String division;

    @Column(length = 45)
    private String department;

    @Column(length = 45)
    private String state;

    private Timestamp createdAt;
}