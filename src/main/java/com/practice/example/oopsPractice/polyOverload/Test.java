package com.practice.example.oopsPractice.polyOverload;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.m1(1001);
        emp2.m1(1002, "Mohan");
        emp3.m1(1003, "Ram", "24061985");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
