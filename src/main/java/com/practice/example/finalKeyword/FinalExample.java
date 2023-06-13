package com.practice.example.finalKeyword;

public class FinalExample {
    final int THRESHOLD = 5;
    final int CAPACITY;
    final int MINIMUM;
    static final double PI = 3.141592653589793;
    static final double EULERCONSTANT;

    {
        CAPACITY = 25;
        System.out.println("Calling non static block");
        System.out.println(toString());
    }

    static {
        EULERCONSTANT = 2.3;
        System.out.println("Calling static block");
//        System.out.println(new FinalExample().toString());
    }

    public FinalExample() {
        MINIMUM = -1;
        System.out.println("Calling Constructor");
        System.out.println(toString());
    }
    public String toString() {
        return "FinalExample{" +
                "THRESHOLD=" + THRESHOLD +
                ", CAPACITY=" + CAPACITY +
                ", MINIMUM=" + MINIMUM +
                ", PI=" + PI +
                ", EULERCONSTANT=" + EULERCONSTANT +
                '}';
    }
}
