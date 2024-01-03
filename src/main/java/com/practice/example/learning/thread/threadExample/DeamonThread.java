package com.practice.example.learning.thread.threadExample;

public class DeamonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        DeamonThread t1 = new DeamonThread();//creating thread
        DeamonThread t2 = new DeamonThread();
        DeamonThread t3 = new DeamonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}