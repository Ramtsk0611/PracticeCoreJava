package com.practice.example.collectionAPI;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
//        ArrayList<String> obj = new ArrayList<String>(16);
//        obj.add("One");
//        obj.add(1,"Two");
//        obj.add("Three");
//        obj.add("Four");
//        obj.add("Five");
//        obj.add("Six");
//        obj.add("Seven");
//        obj.add(0,"1");
//        obj.remove(1);
//        ArrayList<String> obj2 = new ArrayList<String>(32);
//        obj2.addAll(obj);
//        obj2.add("SecondArrayList");
//
//        obj2.removeAll(obj);
//        for(int i=0;i<obj2.size();i++){
//            System.out.println(obj2.get(i));
//        }
////        for(String str : obj){
//            System.out.println(str);
//        }
        ArrayList<Integer> objInt = new ArrayList<Integer>();

        objInt.add(1);
        objInt.add(2);
        objInt.add(3);
        objInt.add(4);
        objInt.add(5);
        objInt.add(6);
        objInt.add(7);
        objInt.add(8);
//        objInt.remove(4);
//        ArrayList<Integer> objInt2 = new ArrayList<Integer>();
//        objInt2.add(56);
//        objInt2.addAll(3 , objInt);


        for (int i=0;i<objInt.size();i++){
            System.out.println(i);
        }

    }
}
