package com.exception.example.config;

import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFeignConfiguration {

    @Bean
    public ErrorDecoder errorDecoder(){
        return new FeignCustomErrorDecoder();
    }
}
