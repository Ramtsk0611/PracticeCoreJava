package com.practice.example.learning.basic.accessSpecifier.package1.pack;

import com.practice.example.learning.basic.accessSpecifier.package1.ACExample;

public class ACTest extends ACExample {
    public static void main(String[] args) {
        ACTest obj = new ACTest();
        obj.m1();
        System.out.println(obj.a);
        System.out.println(obj.str);
    }
}
