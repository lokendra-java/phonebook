package com.phonebook.app.services;

import com.phonebook.app.dtos.UserDto;
import com.phonebook.app.response.ApiResponse;

public interface IUserService {

    //Retrive method
    ApiResponse getUserById(Integer userId);

    ApiResponse getUserByUsername(String username);

    ApiResponse getUserByEmail(String email);

    ApiResponse getAllUsers();

    //Delete method

    ApiResponse deleteUserById(Integer userId);

    ApiResponse deleteUserByEmail(String email);

    ApiResponse deleteUserByUsername(String username);

    //Update method

    ApiResponse updateUserById(Integer userId,UserDto userDto);

    ApiResponse updateUserByEmail(String email,UserDto userDto);

    ApiResponse updateUserByUsername(String username,UserDto userDto);

}
