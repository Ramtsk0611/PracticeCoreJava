package com.practice.example.exceptionHandling;

public class TestException {
    public static void main(String[] args) {
        System.out.println("Calling Main Method before Arthmetic Operation");
        try {
            System.out.println(1 / 0);
        }catch(ArithmeticException arth){
            System.out.println("Can not divide 1 "+arth.getMessage());
        }
        System.out.println("Calling Main Method After Arthmetic Operation");

    }
}
