package com.practice.example.threadExample;

public class Increment {
    static int i;
    synchronized void m1(){
        i++;
    }
}
class Thread1 extends Thread {
    Increment inc = new Increment();
    public void run(){
        for (int i=0;i<1000;i++){
            inc.m1();
        }
        System.out.println(Increment.i);
    }
}
class Test {
    public static void main(String[] args) {
        Thread1 thd1 = new Thread1();
        Thread1 thd2 = new Thread1();
        thd1.start();
        thd2.start();
    }
}
