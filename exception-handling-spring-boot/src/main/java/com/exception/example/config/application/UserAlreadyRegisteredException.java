package com.exception.example.config.application;

import com.exception.example.config.GlobalErrorCode;
import com.exception.example.exception.ExceptionExample;

public class UserAlreadyRegisteredException extends ExceptionExample {

    public UserAlreadyRegisteredException(){
        super("User is already registere", GlobalErrorCode.ERROR_USER_ALREADY_REGISTERED);
    }
    public UserAlreadyRegisteredException(String message, Long code) {
        super(message, code);
    }
}
