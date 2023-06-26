package com.practice.example.collectionAPI;

public class Employee {
       private int empID;
       private String empName;
       private String DOB;
       private int empOldSalary;
       private int empNewSalary;

       public int getEmpID() {
              return empID;
       }

       public void setEmpID(int EmpID) {
              this.empID = empID;
       }

       public String getempName() {
              return empName;
       }

       public void setEmpName(String empiD) {
              this.empName = empName;
       }

       public String getDOB() {
              return DOB;
       }

       public void setDOB(String DOB) {
              this.DOB = DOB;
       }

       public int getEmpOldSalary() {
              return empOldSalary;
       }

       public void setEmpOldSalary(int EmpOldSalary) {
              this.empOldSalary = empOldSalary;
       }

       public int getEmpNewSalary() {
              return empNewSalary;
       }

       public void setEmpNewSalary(int EmpNewSalary) {
              this.empNewSalary = empNewSalary;
       }

       @Override
       public String toString() {
              return "Employee{" +
                      "EmpID=" + empID +
                      ", empName='" + empName + '\'' +
                      ", DOB='" + DOB + '\'' +
                      ", EmpOldSalary=" + empOldSalary +
                      ", EmpOldSalary='" + empNewSalary + '\'' +
                      '}';

       }
}
