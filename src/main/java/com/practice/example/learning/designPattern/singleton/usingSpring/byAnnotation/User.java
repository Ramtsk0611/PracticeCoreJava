package com.practice.example.learning.designPattern.singleton.usingSpring.byAnnotation;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String username;
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void displayUserInfo() {
        System.out.println("User Info: " + username);
    }
}

