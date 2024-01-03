package com.practice.example.learning.oopsPractice.abstraction.interfacePractice;

public class TestInterface {
    public static void main(String[] args) {
        TataAltroz obj = new TataAltroz();
        int a= obj.a;
        obj.tyres();
        obj.breaks();
        obj.engine();
        obj.gearBox();
        obj.streeing();
        System.out.println(obj.a);
        System.out.println(obj.str);
        obj.compact();
        obj.airbags();
        obj.display();
    }
}
