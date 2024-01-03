package com.practice.example.learning.designPattern.singleton.usingSpring.byXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the singleton bean
        UserService userService1 = (UserService) context.getBean("US");
        UserService userService2 = (UserService) context.getBean("US");
        System.out.println(userService1);
        System.out.println(userService2);
        // Set username for the first instance
        userService1.setUsername("John");

        // Display user info for both instances
        userService1.displayUserInfo(); // Output: User Info: John
        userService2.displayUserInfo(); // Output: User Info: John
    }
}

