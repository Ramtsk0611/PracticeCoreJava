package com.practice.example.collectionAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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

    }
}
