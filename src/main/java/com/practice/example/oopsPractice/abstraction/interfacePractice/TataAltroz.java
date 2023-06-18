package com.practice.example.oopsPractice.abstraction.interfacePractice;

import com.practice.example.oopsPractice.InheritancePolyOverride.Child1;
import com.practice.example.oopsPractice.abstraction.Human;

public class TataAltroz extends Human implements Car, Hatchbag{

    @Override
    public void tyres() {
        System.out.println("Calling tyres from Altroz");
    }

    @Override
    public void engine() {
        System.out.println("Calling engine from Altroz");
    }

    @Override
    public void streeing() {
        System.out.println("Calling Streering from Altroz");
    }

    @Override
    public void breaks() {
        System.out.println("Calling breaks from Altroz");
    }

    @Override
    public void gearBox() {
        System.out.println("Calling GearBox from Altroz");
    }
    public void m1(){
        System.out.println("Calling m1 method");
    }

    @Override
    public void compact() {
        System.out.println("Calling compact Method");
    }

    @Override
    public void display() {
        System.out.println("Calling display Method");
    }

    @Override
    public void airbags() {
        System.out.println("Calling airbags Method");
    }

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void play() {

    }
}
