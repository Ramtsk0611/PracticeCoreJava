package com.practice.example.basic;

import java.util.Scanner;

public class BasicPractice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number to validate: ");
        int a = scn.nextInt();
////        if(a>100){
////            System.out.println("It's Greater than 100");
////        } else if(a>50 && a<100){
////            System.out.println("It's Greater than 50 and Less than 100");
////        } else{
////            System.out.println("Lesser than 50");
////        }
//       String str = (a > 100)? "It's Greater than 100":(a>50 && a<100)?"It's Greater than 50 and Less than 100":"Lesser than 50";
//       System.out.println(str);
        int arr[] = new int[a];
        boolean con = true;
        for(int i=0;con;i++){
            if(i>=arr.length){
                break;
            }
            arr[i]=i+100;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
