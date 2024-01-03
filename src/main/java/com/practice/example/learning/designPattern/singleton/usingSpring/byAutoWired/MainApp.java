package com.practice.example.learning.designPattern.singleton.usingSpring.byAutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Singleton class
@Component
class SingletonService {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// Configuration class for Spring
@Configuration
class AppConfigForAnnotation {

    // Creating a singleton bean
    @Bean
    public SingletonService singletonService() {
        return new SingletonService();
    }
}

// Another component that uses the SingletonService
@Component
class SingletonClient {

    @Autowired
    private SingletonService singletonService;

    public void displayMessage() {
        System.out.println("Message from SingletonService: " + singletonService.getMessage());
    }
}

// Main class to run the Spring application
public class MainApp {

    public static void main(String[] args) {
        // Creating the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigForAnnotation.class);

        // Retrieving the SingletonService bean
        SingletonService singletonService = context.getBean(SingletonService.class);

        // Setting a message in SingletonService
        singletonService.setMessage("Hello, I am a singleton!");

        // Retrieving the SingletonClient bean
        SingletonClient singletonClient = context.getBean(SingletonClient.class);

        // Displaying the message using SingletonClient
        singletonClient.displayMessage();
    }
}
