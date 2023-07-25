package com.practice.example.basic.loopPractice;

public class IncDec {
    public static void main(String[] args) {
        int i=0; int j=0;
        System.out.println(i++);//0,0
        System.out.println(i+1);//1,0
        System.out.println(++i);//2,0
        System.out.println(i=i-1);//1,0
        System.out.println(j++);//1,0
        System.out.println(i-(++j));//1,2
        System.out.println(j=j+(++i));//2,4
        System.out.println(i+" - "+j);//2,4
    }
}
