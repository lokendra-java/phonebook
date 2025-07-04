package com.phonebook.app.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.phonebook.app.exceptions.ResourceNotFoundException;
import com.phonebook.app.response.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private ApiResponse response;

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException ex){
        response=ApiResponse.builder()
        .message(ex.getMessage())
        .status(HttpStatus.NOT_FOUND)
        .build();
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
