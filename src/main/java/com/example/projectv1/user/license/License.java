package com.example.projectv1.user.license;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name="license_tb")
@Data
@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String licenseName;

    private Date acquisitionDate;

    @Column(length = 45)
    private String institution;

    private Timestamp createdAt;
}