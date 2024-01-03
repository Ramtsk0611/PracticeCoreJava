package com.practice.example.learning.designPattern.singleton.usingSpring.byAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the singleton bean
        User userService1 = context.getBean(User.class);
        User userService2 = context.getBean(User.class);

        // Set username for the first instance
        userService1.setUsername("John");

        // Display user info for both instances
        userService1.displayUserInfo(); // Output: User Info: John
        userService2.displayUserInfo(); // Output: User Info: John
    }
}

