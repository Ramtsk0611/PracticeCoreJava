package com.practice.example.practice;

public class NullTest {
    public void test(Integer i){
        System.out.println(i);
    }
    public void test(String str){
        System.out.println(str);
    }
    public void test(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        NullTest nullChk = new NullTest();
//        nullChk.test(null);
    }
}
