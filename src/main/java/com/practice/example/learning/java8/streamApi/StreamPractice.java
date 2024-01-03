package com.practice.example.learning.java8.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> intArrList = new ArrayList<>();
        intArrList.add(10);
        intArrList.add(102);
        intArrList.add(45);
        intArrList.add(75);
        intArrList.add(95);
        intArrList.add(35);


//        List<Integer> fileteredArray = intArrList.stream().filter( x-> x>=50).collect(Collectors.toList());
//        fileteredArray.forEach(x-> System.out.println(x));

//        Predicate<Integer> predicateFilter = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n>50;
//            }
//        };

        List<Integer> listOut = intArrList.stream()
//                .filter(predicateFilter)
                .filter(n -> n>50)
                .sorted()
                .map(i -> i*2)
                .collect(Collectors.toList());
        listOut.forEach(out -> System.out.println(out));
    }
}
