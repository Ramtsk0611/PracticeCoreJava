package com.practice.example.collectionAPI;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("One");
        obj.add("Three");
        obj.add("Four");
        obj.add("Five");
        obj.add("Six");
        obj.add("Seven");
        obj.add(0,"1");
        obj.add(1,"Two");
        obj.remove(1);


        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.addAll(obj);
        obj2.add("SecondArrayList");

        obj2.removeAll(obj);
        for(int i=0;i<obj2.size();i++){
            System.out.println(obj2.get(i));
        }
        for(String str : obj){
            System.out.println(str);
        }
        ArrayList objInt = new ArrayList<Integer>();
    }
}
