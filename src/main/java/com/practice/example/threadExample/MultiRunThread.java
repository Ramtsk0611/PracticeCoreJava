package com.practice.example.threadExample;

public class MultiRunThread implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        MultiRunThread m1 = new MultiRunThread();
        Thread t1 = new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }
}
