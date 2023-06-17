package com.practice.example.oopsPractice.abstraction;

public abstract class Person1 extends Human{
    @Override
    void eat() {
        System.out.println("Calling eat from Person1");
    }
    void readingBook(){
        System.out.println("Calling readingBook from Person1");
    }
}
