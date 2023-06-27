package com.practice.example.collectionAPI;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<>();
        map1.put("1006","Manish");
        map1.put("1001","Ram");
        map1.put("1004","Vinay");
        map1.put("1002","Ruthvik");
        map1.put("1005","Manish");
        map1.put("1003","Sandeep");
        map1.put("1001","Mohan");
        System.out.println(map1.toString());
        //EntrySet
        for (Map.Entry<String,String> entry : map1.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        //KeySet
        for (String name : map1.keySet()) {
            System.out.println("key: " + name);
        }
        //Values
        for (String url : map1.values())
            System.out.println("value: " + url);
        //Iterator - EntrySet
        Iterator<Map.Entry<String, String>> itr = map1.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        //Iterator-KeySet
        Iterator<String> itr1 = map1.keySet().iterator();
        while(itr1.hasNext())
        {
            String entry = itr1.next();
            System.out.println("Key = " + entry );
        }
    }
}
