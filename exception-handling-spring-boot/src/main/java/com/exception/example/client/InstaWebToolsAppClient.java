package com.exception.example.client;

import com.exception.example.config.CustomFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="${app.feign.config.name}", url="${app.feign.config.url}",configuration = CustomFeignConfiguration.class)
public interface InstaWebToolsAppClient {

    @RequestMapping(method = RequestMethod.GET, value = "/airlines/{airlineId}")
    String readAirlinesById(@PathVariable String airlineId);

}
