package com.practice.example.collectionAPI;

import java.util.ArrayList;
import java.util.Collections;

import static com.practice.example.oopsPractice.abstraction.interfacePractice.Car.str;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("One");
        obj.add(1,"Two");
        obj.add("Three");
        obj.add("Four");
        obj.add("Five");
        obj.add("Six");
        obj.add("Seven");
        obj.add(0,"1");
        obj.remove(1);
        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.addAll(obj);
        obj2.add("SecondArrayList");

       // obj2.removeAll(obj);
        for(int i=0;i<obj2.size();i++){
            System.out.println(obj2.get(i));
        }
//        for(String str : obj){
            System.out.println(str);
//        }
        ArrayList<String> objInt = new ArrayList<String>();

        objInt.add("1hj");
        objInt.add("2g");
        objInt.add("3hk");
        objInt.add("4hk");
        objInt.add("5gjv");
        objInt.add("6lkl");
        objInt.add("7;lm");
        objInt.add("8vvg");
       objInt.remove(4);
//        ArrayList<Integer> objInt2 = new ArrayList<Integer>();
//        objInt2.add(56);
//        objInt2.addAll(3 , objInt);


        for (int i=0;i<objInt.size();i++){
            System.out.println(objInt.get(i));
        }

    }
}
