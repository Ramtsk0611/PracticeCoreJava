package com.practice.example.learning.collectionAPI;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1006,"Manish");
        map1.put(1001,"Ram");
        map1.put(1004,"Vinay");
        map1.put(1002,"Ruthvik");
        map1.put(1005,"Manish");
        map1.put(1003,"Sandeep");
        map1.put(1001,"Mohan");

//        System.out.println(map1.toString());
        //EntrySet
        for (Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        //KeySet
        for (Integer id : map1.keySet()) {
            System.out.println("key: " + id);
        }
        //Values
        for (String url : map1.values())
            System.out.println("value: " + url);
        //Iterator - EntrySet
        Iterator<Map.Entry<Integer, String>> itr = map1.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        //Iterator-KeySet
        Iterator<Integer> itr1 = map1.keySet().iterator();
        while(itr1.hasNext())
        {
            Integer entry = itr1.next();
            System.out.println("Key = " + entry );
        }
    }
}
