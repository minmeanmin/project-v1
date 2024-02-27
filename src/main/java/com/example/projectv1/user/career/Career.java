package com.example.projectv1.user.career;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name="career_tb")
@Data
@Entity
public class Career {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(length = 45)
        private String companyName;

        private Date startDate;
        private Date endDate;

        private Timestamp createdAt;
}
