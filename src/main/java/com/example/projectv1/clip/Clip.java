package com.example.projectv1.clip;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name="clip_tb")
@Data
@Entity
public class Clip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;
    private Integer noticeId;

    private Timestamp createdAt;
}
