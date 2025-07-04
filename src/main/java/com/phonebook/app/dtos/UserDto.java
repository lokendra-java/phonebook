package com.phonebook.app.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserDto {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String password;
    private String confirmPassword;
    private String username;
}
