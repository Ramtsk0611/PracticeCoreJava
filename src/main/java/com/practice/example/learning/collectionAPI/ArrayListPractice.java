package com.practice.example.learning.collectionAPI;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("One");//0
        obj.add("Three");//1
        obj.add("Four");//2
        obj.add("Five");//3
        obj.add("Six");//4
        obj.add("Seven");//5
        for(int i=0;i<obj.size();i++){
            System.out.println(">>>>>>First Loop: "+obj.get(i));
        }
        obj.add(0,"1");
        obj.add(1,"Two");
        for(int i=0;i<obj.size();i++){
            System.out.println(">>>>>>Second Loop: "+obj.get(i));
        }
        obj.remove(1);
        for(int i=0;i<obj.size();i++){
            System.out.println(">>>>>>Third Loop: "+obj.get(i));
        }
        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.addAll(obj);
        obj2.add("SecondArrayList");
        for(int i=0;i<obj2.size();i++){
            System.out.println(">>>>>>Forth Loop: "+obj2.get(i));
        }
        obj2.removeAll(obj);
        for(int i=0;i<obj2.size();i++){
            System.out.println(">>>>>>Fifth Loop: "+obj2.get(i));
        }
        LinkedList<Student> stuObj = new LinkedList<>();
        Student stu1 = new Student(1001, "Sam", "5-April-2005", 18,"Male");
        Student stu3 = new Student(1003, "Chandan", "9-May-2002", 21,"Male");
        Student stu4 = new Student(1004, "VishnuVardhan", "9-Sep-2000", 23,"Male");
        Student stu5 = new Student(1005, "Kireety", "28-Nov-2000", 22,"Male");
        Student stu2 = new Student();
        stu2.setStuID(1002);
        stu2.setStuName("Vishnupriya");
        stu2.setDob("13-Oct-1995");
        stu2.setStuAge(27);
        stu2.setGender("Female");
        stuObj.add(stu1);
        stuObj.add(stu2);
        stuObj.add(stu3);
        stuObj.add(stu4);
        stuObj.add(stu5);
//        Collections.sort(stuObj);
        for(Student temp:stuObj){
            System.out.println(temp.getStuName());
        }

    }
}
