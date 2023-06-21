package com.practice.example.collectionAPI;

import java.util.Arrays;

public class MyArrayList<Integer> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;
    private int elements[];

    public MyArrayList() {
        elements = new int[DEFAULT_CAPACITY];
    }
//1,2,3,3,4,.... 16
    public void add(Integer e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = (int) e;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //1,2,3,3,4 -- 10
    public int get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return elements[i];
    }
}

