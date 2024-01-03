package com.practice.example.learning.collectionAPI;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int stuID;
    private String stuName;
    private String dob;
    private int stuAge;
    private String gender;
    public Student(){

    }
    public Student(int stuID, String stuName, String dob, int stuAge, String gender) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.dob = dob;
        this.stuAge = stuAge;
        this.gender = gender;
    }
    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", stuName='" + stuName + '\'' +
                ", dob='" + dob + '\'' +
                ", stuAge=" + stuAge +
                ", gender='" + gender + '\'' +
                '}';
    }
//    @Override
//    public int compareTo(Student o) {
//        return this.getStuName().compareTo(o.getStuName());
//    }
    @Override
    public int compareTo(Student o) {
       if(this.getStuID()>o.getStuID()){
           return 1;
       } else if(this.getStuID()<o.getStuID()){
           return -1;
       } else {
           return 0;
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuID == student.stuID && stuAge == student.stuAge && Objects.equals(stuName, student.stuName) && Objects.equals(dob, student.dob) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuID, stuName, dob, stuAge, gender);
    }
}
