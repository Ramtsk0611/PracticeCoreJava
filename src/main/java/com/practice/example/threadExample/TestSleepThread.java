package com.practice.example.threadExample;

public class TestSleepThread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
            System.out.println(Thread.currentThread()+"-"+i);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        TestSleepThread t1 = new TestSleepThread();
        TestSleepThread t2 = new TestSleepThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Main Thread End");
    }
}