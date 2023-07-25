package com.practice.example.staticKeyword;

public class StaticExample {
    // Instance variable
    static int a = 10;
    static int b;
    String str = "Hi...";
    void m1(){
        str = "Non Static Variable";
        b = 100;
    }
    static void m2(){
        a = 150;
        b = 250;
        StaticExample obj2 = new StaticExample();
        obj2.m1();
//        System.out.println(obj2.str);
//        m1();
    }
}
