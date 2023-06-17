package com.practice.example.oopsPractice.abstraction;

public class Person3 extends Human{
    @Override
    void eat() {
        System.out.println("Calling eat Method from Person3");
    }

    @Override
    void walk() {
        System.out.println("Calling walk Method from Person3");
    }

    @Override
    void play() {
        System.out.println("Calling Play Method from Person3");
    }
    void drive(){
        System.out.println("calling drive from Person3");
    }
}
