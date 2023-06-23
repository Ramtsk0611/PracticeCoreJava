package com.practice.example.collectionAPI;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Ram");
        set.add("Ruthvhik");
        set.add("Vinay");
        set.add("Manish");
        set.add("Ram");
        System.out.println(set.toString());
    }
}
