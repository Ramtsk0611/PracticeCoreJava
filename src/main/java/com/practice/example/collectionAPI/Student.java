package com.practice.example.collectionAPI;

public class Student {
    private int stuID;
    private String stuName;
    private String dob;
    private int stuAge;
    private String gender;

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
}
