package com.exception.example.exception;

import lombok.Getter;

@Getter
public class ExceptionExample extends RuntimeException{

    private Long code;

    public ExceptionExample (String message,Long code){
        super(message);
        this.code=code;
    }
}
