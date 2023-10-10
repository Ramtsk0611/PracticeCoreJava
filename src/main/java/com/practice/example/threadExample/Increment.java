package com.practice.example.threadExample;

public class Increment {
    static int count;
    void  m1() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
//            count++;
    }
}
class Thread1 extends Thread {
    Increment obj = new Increment();
    public void run() {
        obj.m1();
    }
}
//class Thread1 extends Thread {
//    Increment obj = new Increment();
//    public void run() {
//        synchronized (Increment.class) {
//            for (int i = 0; i < 1000; i++) {
//                obj.m1();
//            }
//        }
//    }
//}
class TestIncrement {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thd1 = new Thread1();
        Thread1 thd2 = new Thread1();
        Thread1 thd3 = new Thread1();
        thd1.start();
        thd2.start();
        thd3.start();
        thd1.join();
        thd2.join();
        thd3.join();
        System.out.println(Increment.count);
    }
}
