package com.practice.example.staticKeyword;

public class StaticMethodExample {
    // static variable
    static int a = m1();
    {
        System.out.println("Inside Non static block");
    }
    static {
        System.out.println("Inside static block");
    }

    StaticMethodExample(){
        System.out.println("Calling Default Constructor");
    }
    StaticMethodExample(int a){
        System.out.println("Calling Parametrized Constructor");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }
}
