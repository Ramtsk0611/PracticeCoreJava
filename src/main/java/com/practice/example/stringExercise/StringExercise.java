package com.practice.example.stringExercise;

public class StringExercise {
    public static void main(String[] args) {
        String str = "java";//String Literal
        String str1 = new String("java");//String Constant pool in Heap memory
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
    }
}
