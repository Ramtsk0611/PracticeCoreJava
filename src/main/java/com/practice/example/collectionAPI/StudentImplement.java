package com.practice.example.collectionAPI;

import java.util.ArrayList;

public class StudentImplement {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setStuID(1001);
        obj1.setStuName("Ruthvik");
        obj1.setDob("21-March-2005");
        obj1.setGender("Male");
        obj1.setStuAge(18);
        Student obj2 = new Student();
        obj2.setStuID(1002);
        obj2.setStuName("Ambika");
        obj2.setDob("13-May-1998");
        obj2.setGender("Female");
        obj2.setStuAge(25);
        ArrayList<Student> stuObj1 = new ArrayList<Student>();
        stuObj1.add(obj1);
        stuObj1.add(obj2);
        for(Student stu:stuObj1){
//            System.out.println(stu.toString());
            System.out.println(stu.getStuName());
        }
    }
}
