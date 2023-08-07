package com.practice.example.exceptionHandling;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOScanTest {
    public static void main(String[] argv) {
        String s = null;
        try(Scanner scanner = new Scanner(s)) {
            System.out.println("" + scanner.next());
        }catch(NullPointerException n){
            System.out.println("Inside N: "+n.toString());
        }catch(Exception e){
            System.out.println("Inside Exception"+e.toString());
        }
        System.out.println("After catch");
    }
}

