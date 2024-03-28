package com.exception.example.config.application;

import com.exception.example.config.GlobalErrorCode;
import com.exception.example.exception.ExceptionExample;

public class FeignClientException extends ExceptionExample {

    public FeignClientException(){
        super("Feign client error", GlobalErrorCode.ERROR_FEIGN_CLIENT);
    }
    public FeignClientException(String message, Long code) {
        super(message, code);
    }
}
