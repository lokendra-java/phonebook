package com.phonebook.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user_tab")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",nullable = false)
    private Integer userId;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name ="last_name",nullable = false)
    private String lastName;
    @Column(name="email",nullable = false,unique = true)
    private String email;
    @Column(name = "mobile_no.",nullable = false,length = 12)
    private String mobile;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "confirm_password",nullable = false)
    private String confirmPassword;
    @Column(name = "username",nullable = false,unique = true)
    private String username;
}
