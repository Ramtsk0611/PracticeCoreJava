package com.practice.example.oopsPractice.abstraction;

public abstract class Human {
    int a;
    String str;
    abstract void eat();
    abstract void walk();
    abstract void play();
    public void breath(){
        System.out.println("Calling Breath Method from Human");
    }
    public void sleep(){
        System.out.println("Calling Sleep method from Human");
    }
}
