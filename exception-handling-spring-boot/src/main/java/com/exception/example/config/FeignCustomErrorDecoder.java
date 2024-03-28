package com.exception.example.config;

import com.exception.example.config.application.FeignClientException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignCustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()){
            case 400:
                return  new FeignClientException("Bad request through feign",GlobalErrorCode.ERROR_FEIGN_CLIENT);
            case 401:
                return new FeignClientException("Unauthorized access ",GlobalErrorCode.ERROR_FEIGN_CLIENT);
            case 404:
                return new FeignClientException("Undentified request through feign ",GlobalErrorCode.ERROR_FEIGN_CLIENT);
            default:
                return new FeignClientException("Coomon Feign Exception ", GlobalErrorCode.ERROR_FEIGN_CLIENT);
        }
    }
}
