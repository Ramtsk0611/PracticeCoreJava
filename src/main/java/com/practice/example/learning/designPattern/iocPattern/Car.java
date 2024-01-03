package com.practice.example.learning.designPattern.iocPattern;

public class Car implements Rental{
    private float rent;
    private String location;
    private float tips;
    @Override
    public void goToOffice() {
        System.out.println(this.location+" -- "+this.rent+"--"+this.tips);
    }

    @Override
    public void leaveFromOffice() {
        System.out.println(this.location+" -- "+this.rent+"--"+this.tips);
    }
}
