package com.example.projectv1.user.prize;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name="prize_tb")
@Data
@Entity
public class Prize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String contestName;

    @Column(length = 45)
    private String prizeName;

    private Date acquisitionDate;

    @Column(length = 45)
    private String institution;

    private Timestamp createdAt;
}