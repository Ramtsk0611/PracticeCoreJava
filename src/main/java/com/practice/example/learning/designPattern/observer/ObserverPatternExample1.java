package com.practice.example.learning.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject1 {
    void registerObserver(Observer1 observer);

    void removeObserver(Observer1 observer);

    void notifyObservers();
}

// Concrete subject implementation
class ConcreteSubject implements Subject1 {
    private int state;
    private List<Observer1> observers = new ArrayList<>();

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer1 observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer1 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer1 observer : observers) {
            observer.update(state);
        }
    }
}

// Observer interface
interface Observer1 {
    void update(int state);
}

// Concrete observer implementations
class ConcreteObserver implements Observer1 {
    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(int state) {
        System.out.println(observerName + " received update. New state: " + state);
    }
}

// Main class to run the application
public class ObserverPatternExample1 {
    public static void main(String[] args) {
        // Creating a concrete subject
        ConcreteSubject subject = new ConcreteSubject();

        // Creating concrete observers
        Observer1 observer1 = new ConcreteObserver("Observer 1");
        Observer1 observer2 = new ConcreteObserver("Observer 2");

        // Registering observers with the subject
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Setting the state of the subject, which triggers notifications to observers
        subject.setState(10);

        // Unregistering an observer
        subject.removeObserver(observer1);

        // Setting the state again to see the effect on remaining observer
        subject.setState(20);
    }
}