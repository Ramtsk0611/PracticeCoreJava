package com.practice.example.oopsPractice.abstraction;

public class Person2 extends Person1{
    @Override
    void walk() {
        System.out.println("Calling walk from Person2");
    }

    @Override
    void play() {
        System.out.println("Calling Play from Person2");
    }
    void run(){
        System.out.println("Calling run from Person2");
    }
}
