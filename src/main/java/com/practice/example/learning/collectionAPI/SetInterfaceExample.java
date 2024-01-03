package com.practice.example.learning.collectionAPI;

import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ram");
        set.add("Ruthvhik");
        set.add("Vinay");
        set.add("Manish");
        set.add("Ram");
        System.out.println(set.toString());
        for(String str: set){
            System.out.println(str);
        }
        Iterator<String> itr1 = set.iterator();
        while(itr1.hasNext())
        {
            String key = itr1.next();
            System.out.println("Key = " + key );
        }
    }
}
