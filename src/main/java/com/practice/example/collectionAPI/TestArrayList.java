package com.practice.example.collectionAPI;

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        for(int i=0;i<16;i++){
            list.add(i);
        }
        list.add(16);
        System.out.println(list.get(16));
    }
}
