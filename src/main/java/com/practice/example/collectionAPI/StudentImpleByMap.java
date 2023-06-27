package com.practice.example.collectionAPI;

import java.util.*;

public class StudentImpleByMap {
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
        Student obj3 = new Student();
        obj3.setStuID(1003);
        obj3.setStuName("Vinay");
        obj3.setDob("01-Sep-1988");
        obj3.setGender("Male");
        obj3.setStuAge(35);
        Student obj4 = new Student();
        obj4.setStuID(1004);
        obj4.setStuName("Manish");
        obj4.setDob("25-July-2000");
        obj4.setGender("Male");
        obj4.setStuAge(22);
        Student obj5 = new Student();
        obj5.setStuID(1005);
        obj5.setStuName("Manish Kumar");
        obj5.setDob("25-July-1990");
        obj5.setGender("Male");
        obj5.setStuAge(32);
        Student obj6 = new Student();
        obj6.setStuID(1006);
        obj6.setStuName("ManishKumar");
        obj6.setDob("25-June-1992");
        obj6.setGender("Male");
        obj6.setStuAge(27);
        Student obj7 = new Student();
        obj7.setStuID(1007);
        obj7.setStuName("Kumar");
        obj7.setDob("25-May-1990");
        obj7.setGender("Male");
        obj7.setStuAge(32);
        Map<Student,String> mapStudent = new TreeMap<>();
        mapStudent.put(obj1, "Student no 1");
        mapStudent.put(obj2, "Student no 2");
        mapStudent.put(obj3, "Student no 3");
        mapStudent.put(obj4, "Student no 4");
        mapStudent.put(obj5, "Student no 5");
        mapStudent.put(obj6, "Student no 6");
        mapStudent.put(obj7, "Student no 7");
        Iterator<Map.Entry<Student,String>> itr_stu = mapStudent.entrySet().iterator();

        while(itr_stu.hasNext()){
            Map.Entry<Student, String> entry = itr_stu.next();
            Student obj = entry.getKey();
            String value = entry.getValue();
//            if(obj.getStuAge()>20) {
                System.out.println(obj.toString());
                System.out.println(value);
//            }
        }
    }
}
