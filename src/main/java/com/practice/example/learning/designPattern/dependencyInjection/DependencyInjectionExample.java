package com.practice.example.learning.designPattern.dependencyInjection;

// Service interface
interface MessageService {
    String getMessage();
}

// Concrete implementation of the Service interface
class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email Message";
    }
}

// Another concrete implementation of the Service interface
class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS Message";
    }
}

// Client class that depends on a MessageService
class MessageProcessor {

    private final MessageService messageService;

    // Constructor injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage() {
        String message = messageService.getMessage();
        System.out.println("Processing message: " + message);
    }
}

// Main class to run the application
public class DependencyInjectionExample {

    public static void main(String[] args) {
        // Using EmailService
        MessageService emailService = new EmailService();
        MessageProcessor emailProcessor = new MessageProcessor(emailService);
        emailProcessor.processMessage();

        // Using SMSService
        MessageService smsService = new SMSService();
        MessageProcessor smsProcessor = new MessageProcessor(smsService);
        smsProcessor.processMessage();
    }
}
