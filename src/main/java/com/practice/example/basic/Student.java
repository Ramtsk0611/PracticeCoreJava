package com.practice.example.basic;

public class Student {


    private int stu_id;
    private String stu_name;
    private String stu_class;
    private String stu_DOB;
    public Student(){

    }
    public Student(int stu_id){
        this.stu_id = stu_id;
    }
    public Student(int stu_id,  String stu_name){
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }
    public Student(int stu_id,  String stu_name, String stu_class){
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_class = stu_class;
    }
    public Student(int stu_id,  String stu_name, String stu_class, String stu_DOB){
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_class = stu_class;
        this.stu_DOB = stu_DOB;
    }
    public void setStu_id(int stu_id1) {
        stu_id = stu_id1;
    }
    public int getStu_id() {
        return stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_class='" + stu_class + '\'' +
                ", stu_DOB='" + stu_DOB + '\'' +
                '}';
    }
}
