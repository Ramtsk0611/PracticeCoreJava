package com.practice.example.learning.exceptionHandling;

public class TestException {
    public static void main(String[] args) {
        System.out.println("Calling Main Method before Arthmetic Operation");
        try {
            System.out.println(1 / 0);
        }catch(ArithmeticException arth){
            System.out.println("Can not divide 1 "+arth.getMessage());
        } finally{

        }
        System.out.println("Calling Main Method After Arthmetic Operation");

    }
}
