package com.practice.example.learning.collectionAPI;
import java.util.Comparator;

public class StudSortById implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getStuID() > o2.getStuID()){
            return -1;
        } else if (o1.getStuID() < o2.getStuID()){
            return 1;
        } else {
            return 0;
        }
    }
}

