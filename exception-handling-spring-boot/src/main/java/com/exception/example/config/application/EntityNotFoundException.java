package com.exception.example.config.application;

import com.exception.example.config.GlobalErrorCode;
import com.exception.example.exception.ExceptionExample;

public class EntityNotFoundException extends ExceptionExample {

   public EntityNotFoundException(){
       super("Entity not found", GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);

   }

    public EntityNotFoundException(String message, Long code) {
        super(message, code);
    }
}
