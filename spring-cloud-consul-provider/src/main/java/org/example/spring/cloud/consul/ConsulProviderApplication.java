package org.example.spring.cloud.consul;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConsulProviderApplication {

    @Value("${hello:abc}")
    private String hello;

    @RequestMapping("/")
    public String home() {
        return hello;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulProviderApplication.class).web(true).run(args);
    }

}
