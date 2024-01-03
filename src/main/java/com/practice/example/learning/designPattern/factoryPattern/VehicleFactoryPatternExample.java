package com.practice.example.learning.designPattern.factoryPattern;

//Vehicle is the product interface with start() and stop() methods.
//Car and Bike are concrete implementations of the Vehicle interface.
//VehicleFactory is the factory interface with a createVehicle() method.
//CarFactory and BikeFactory are concrete implementations of the VehicleFactory interface, each creating a specific type of vehicle.
//The client code (FactoryPatternExample) demonstrates how to use the factory pattern to create instances of different vehicles without specifying their concrete classes directly. This provides flexibility and allows for easy extension when adding new types of vehicles.


// Product interface
interface Vehicle {
    void start();
    void stop();
}

// Concrete implementations of the product interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

// Factory interface
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete implementations of the factory interface
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

// Client code using the factory pattern
public class VehicleFactoryPatternExample {

    public static void main(String[] args) {
        // Creating a car using CarFactory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();
        car.stop();

        // Creating a bike using BikeFactory
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.start();
        bike.stop();
    }
}