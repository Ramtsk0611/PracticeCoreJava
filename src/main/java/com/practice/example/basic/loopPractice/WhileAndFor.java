package com.practice.example.basic.loopPractice;

public class WhileAndFor {
    public static void main(String[] args) {
        //While Loop
        int i = 0;
        while (i < 20){
            System.out.print(i);
            i++;
        }
        System.out.println();
        //Do While Loop
        i=0;
        do{
            System.out.print(i);
            i++;
        }while(i<20);
        System.out.println();
        //For Loop
        for (int j = 0; j < 20; j++){
            System.out.print(j);
        }
    }
}
