package com.practice.example.learning.designPattern.iocPattern;

public class Employee {
    private Rental car;
    public Employee(Rental car){
        this.car = car;
    }
    public void DriveToOffice(){
        this.car.goToOffice();
    }
    public void DriveToHome(){
        this.car.leaveFromOffice();
    }
}
