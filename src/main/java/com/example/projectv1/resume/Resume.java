package com.example.projectv1.resume;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name="resume_tb")
@Data
@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String companyName;

    @Column(length = 45)
    private String field;

    private Timestamp createdAt;
}