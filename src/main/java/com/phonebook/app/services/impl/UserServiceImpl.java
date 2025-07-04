package com.phonebook.app.services.impl;

import org.springframework.stereotype.Service;

import com.phonebook.app.dtos.UserDto;
import com.phonebook.app.response.ApiResponse;
import com.phonebook.app.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    private ApiResponse response=null;

    @Override
    public ApiResponse getUserById(Integer userId) {
        return response;
    }

    @Override
    public ApiResponse getUserByUsername(String username) {
      return response;
    }

    @Override
    public ApiResponse getUserByEmail(String email) {
         return response;
       
    }

    @Override
    public ApiResponse getAllUsers() {
         return response;
       
    }

    @Override
    public ApiResponse deleteUserById(Integer userId) {
         return response;
       
    }

    @Override
    public ApiResponse deleteUserByEmail(String email) {
         return response;
        
    }

    @Override
    public ApiResponse deleteUserByUsername(String username) {
         return response;
       
    }

    @Override
    public ApiResponse updateUserById(Integer userId, UserDto userDto) {
         return response;
       
    }

    @Override
    public ApiResponse updateUserByEmail(String email, UserDto userDto) {
         return response;
       
    }

    @Override
    public ApiResponse updateUserByUsername(String username, UserDto userDto) {
         return response;
       
    }

}
