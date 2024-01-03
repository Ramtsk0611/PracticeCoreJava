package com.practice.example.learning.designPattern.singleton.usingSpring.byAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton") // This is the default scope, so this annotation is optional here
    public User userService() {
        return new User();
    }
}

