package com.practice.example.staticKeyword;

public class StaticExample {
    // Instance variable
    static int a = 10;
    static int b;
    String str;
    void m1(){
        str = "Non Static Variable";
        b = 100;
    }
    static void m2(){
        a = 150;
        b = 250;
        StaticExample obj = new StaticExample();
        obj.m1();
    }
}
