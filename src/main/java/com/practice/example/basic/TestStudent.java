package com.practice.example.basic;

public class TestStudent {
    public static void main(String[] args) {
        Student obj = new Student();
//        Student obj1 = new Student(1001);
//        Student obj2 = new Student(1002, "Ram");
//        Student obj3 = new Student(1003, "Ram", "10th");
//        Student obj4 = new Student(1004, "Ram", "10th", "24-06-1985");
        obj.setStu_id(1003);
        System.out.println(obj.toString());
//        System.out.println(obj1.toString());
//        System.out.println(obj2.toString());
//        System.out.println(obj3.toString());
//        System.out.println(obj4.toString());
        System.out.println(obj.getStu_id());
    }
}
