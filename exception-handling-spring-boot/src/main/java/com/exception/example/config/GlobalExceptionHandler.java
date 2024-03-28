package com.exception.example.config;

import com.exception.example.exception.ExceptionExample;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler({ExceptionExample.class})
    protected  ResponseEntity handleGlobalException(ExceptionExample ex){
        return ResponseEntity.badRequest().body(ErrorResponse.builder().code(ex.getCode()).message(ex.getMessage()).build());
    }

    @ExceptionHandler({Exception.class})
    protected ResponseEntity handleException(Exception e, Locale locale){
     return ResponseEntity.badRequest().body("Exception occured inside API "+ e);
    }
}
