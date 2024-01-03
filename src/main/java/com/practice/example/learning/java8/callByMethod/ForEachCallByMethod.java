package com.practice.example.learning.java8.callByMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachCallByMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Naveen","Manoj","Ram","Mohan");
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(con);
        names.forEach(System.out::print);
    }
}
