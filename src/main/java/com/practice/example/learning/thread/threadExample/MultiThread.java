package com.practice.example.learning.thread.threadExample;
public class MultiThread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String args[]) {
        MultiThread t1 = new MultiThread();
        t1.start();
    }
}
