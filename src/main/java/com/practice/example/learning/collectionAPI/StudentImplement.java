package com.practice.example.learning.collectionAPI;

import java.util.ArrayList;
import java.util.Collections;

public class StudentImplement {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setStuID(1010);
        obj1.setStuName("Ruthvik");
        obj1.setDob("21-March-2005");
        obj1.setGender("Male");
        obj1.setStuAge(18);
        Student obj2 = new Student();
        obj2.setStuID(1008);
        obj2.setStuName("Ambika");
        obj2.setDob("13-May-1998");
        obj2.setGender("Female");
        obj2.setStuAge(25);
        Student obj3 = new Student();
        obj3.setStuID(1052);
        obj3.setStuName("Vinay");
        obj3.setDob("01-Sep-1988");
        obj3.setGender("Male");
        obj3.setStuAge(35);
        Student obj4 = new Student();
        obj4.setStuID(1085);
        obj4.setStuName("Manish");
        obj4.setDob("25-July-2000");
        obj4.setGender("Male");
        obj4.setStuAge(22);
        Student obj5 = new Student();
        obj5.setStuID(1015);
        obj5.setStuName("ManishKumar");
        obj5.setDob("25-July-1990");
        obj5.setGender("Male");
        obj5.setStuAge(32);
        ArrayList<Student> stuObj1 = new ArrayList<Student>();
        stuObj1.add(obj1);
        stuObj1.add(obj2);
        stuObj1.add(obj3);
        stuObj1.add(obj4);
        stuObj1.add(obj5);
        System.out.println(stuObj1.toString());
//        Collections.sort(stuObj1);
        System.out.println(stuObj1.toString());
        Collections.sort(stuObj1,new StudSortByName());
        System.out.println(stuObj1.toString());
        Collections.sort(stuObj1,new StudSortById());
        System.out.println(stuObj1.toString());
    }
}
