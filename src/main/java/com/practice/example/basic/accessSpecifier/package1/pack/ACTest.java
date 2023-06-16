package com.practice.example.basic.accessSpecifier.package1.pack;

import com.practice.example.basic.accessSpecifier.package1.ACExample;

public class ACTest extends ACExample {
    public static void main(String[] args) {
        ACTest obj = new ACTest();
        System.out.println(obj.a);
        obj.m1();
        System.out.println(obj.str);
    }
}
