package com.practice.example.learning.finalKeyword;

public class FinalExample {
    final int THRESHOLD = 5;
    final int CAPACITY;
    final int MINIMUM;
    static final double PI = 3.141592653589793;
    static final double EULERCONSTANT;

    {
        CAPACITY = 25;
    }

    static {
        EULERCONSTANT = 2.3;
    }

    public FinalExample() {
        MINIMUM = -1;
    }

    @Override
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
