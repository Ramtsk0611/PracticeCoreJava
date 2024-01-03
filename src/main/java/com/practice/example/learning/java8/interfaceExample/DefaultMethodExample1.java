package com.practice.example.learning.java8.interfaceExample;

@FunctionalInterface
interface Interface1 {
    void method1(String str);
    default void log(String str){
        System.out.println("I1 logging::"+str);
    }
    static void print(String str){
        System.out.println("Printing "+str);
    }
}

interface Interface2 {
    default void log(String str){
        System.out.println("I2 logging::"+str);
    }
}
public class DefaultMethodExample1 implements Interface1, Interface2 {
    @Override
    public void method1(String str) {

    }
    //MyClass won't compile without having it's own log() implementation
    @Override
    public void log(String str) {
//        System.out.println("MyClass logging::" + str);
//        Interface1.super.log("MyClass logging::"+str);
        Interface2.super.log("MyClass logging::"+str);
    }

    public static void main(String[] args) {
        DefaultMethodExample1 obj = new DefaultMethodExample1();
//        obj.print("");
//        DefaultMethodExample1.print("");
        Interface1.print("Hi Static Method...");
    }
}
