package com.practice.example.learning.thread.threadExample;

public class TestSleepMain {
    public void runTest() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread()+"-"+i);
        }
    }
    public static void main(String argvs[]) {
        TestSleepMain obj1 = new TestSleepMain();
        TestSleepMain obj2 = new TestSleepMain();
        TestSleepMain obj3 = new TestSleepMain();
        TestSleepMain obj4 = new TestSleepMain();
        obj1.runTest();
        obj2.runTest();
        obj3.runTest();
        obj4.runTest();
    }
}
