package com.phonebook.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.app.dtos.UserDto;
import com.phonebook.app.paylod.JwtRequest;
import com.phonebook.app.paylod.JwtResponse;
import com.phonebook.app.response.ApiResponse;
import com.phonebook.app.services.IUserService;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    //http://localhost:9191/api/auth/
    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> signIn(@RequestBody JwtRequest jwtRequest){
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse> signUp(@RequestBody UserDto userDto){
        return null;
    }
}
