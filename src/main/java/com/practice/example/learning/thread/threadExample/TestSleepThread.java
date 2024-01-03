package com.practice.example.learning.thread.threadExample;

public class TestSleepThread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread()+"-"+i);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        TestSleepThread t1 = new TestSleepThread();
        TestSleepThread t2 = new TestSleepThread();
        TestSleepThread t3 = new TestSleepThread();
        TestSleepThread t4 = new TestSleepThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        System.out.println("Main Thread End");
    }
}