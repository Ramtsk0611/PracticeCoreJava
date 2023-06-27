package com.practice.example.collectionAPI;

import java.util.Comparator;

public class StudSortById implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        if(o1.getStuID() > o2.getStuID()){
//            return -1;
//        } else if (o1.getStuID() < o2.getStuID()){
//            return 1;
//        } else {
//            return 0;
//        }
        return o1.getStuName().compareTo(o2.getStuName());
    }
}
