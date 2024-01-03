package com.practice.example.learning.thread.threadExample;

public class MultiRunThread1 implements Runnable {
    public void run()
    {
        System.out.println("Now the thread is running ...");
    }
    public static void main(String argvs[])
    {
        MultiRunThread1 r1 = new MultiRunThread1();
        r1.m1();
        Thread th1 = new Thread(r1, "My new thread");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
    void m1(){
        System.out.println("calling m1 method");
    }
}
