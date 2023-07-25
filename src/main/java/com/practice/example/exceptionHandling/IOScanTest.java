package com.practice.example.exceptionHandling;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOScanTest {
    public static void main(String[] argv) {
        String s = "&^%^#$#jhfgjg";
        try(Scanner scanner = new Scanner(s)) {
            System.out.println("" + scanner.nextInt());
            scanner.close();
        }catch(NullPointerException n){
            System.out.println("Inside N: "+n.toString());
        }catch(Exception e){
            System.out.println("Inside Exception"+e.toString());
        }
        System.out.println("After catch");
    }
}

