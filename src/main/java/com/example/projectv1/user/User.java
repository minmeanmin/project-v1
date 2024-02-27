package com.example.projectv1.user;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name="user_tb")
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String nickname;

    @Column(length = 32)
    private String password;

    @Column(length = 16)
    private String username;

    @Column(length = 11)
    private String phone_num;

    private String email;
    private String photo;

    private Timestamp createdAt;
}
