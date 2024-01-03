package com.practice.example.learning.oopsPractice.polyOverload;

public class Employee {
    int empId;
    String empName;
    String empDOB;
    Employee(){     }
    Employee(int empId) { this.empId = empId;}
    Employee(int empId, String empName) { this.empId = empId; this.empName = empName;}
    Employee(int empId, String empName, String empDOB) { this.empId = empId; this.empName = empName;
    this.empDOB = empDOB;}
    public void m1(){}
    public void m1(int empId) {
        this.empId = empId;
    }
    public void m1(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public void m1(int empId, String empName, String empDOB) {
        this.empId = empId;
        this.empName = empName;
        this.empDOB = empDOB;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDOB='" + empDOB + '\'' +
                '}';
    }
}
