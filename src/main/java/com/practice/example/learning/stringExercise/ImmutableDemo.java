package com.practice.example.learning.stringExercise;

public class ImmutableDemo{
    public static void main(String ar[]) {
        Employee e = new Employee("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}
