package com.practice.example.learning.thread.threadExample;

class A {
    public synchronized void first(B b) {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie) {}
        System.out.println(" HelloClass is calling 	HiClass second() method");
        b.second();
    }

    public synchronized void second() {
        System.out.println("I am inside second method of HelloClass");
    }
}

class B {
    public synchronized void first(A a) {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){

        }
        System.out.println(" HiClass is calling HelloClass second() method");
        a.second();
    }

    public synchronized void second() {
        System.out.println("I am inside second method of HiClass");
    }
}

class DeadLockClass {
    public static void main(String[] args) {
        A he = new A();
        B hi = new B();
        Thread thrd1 = new Thread(new Runnable(){
            @Override
            public void run() {
                hi.first(he);
            }
        });
        Thread thrd2 = new Thread(new Runnable(){
            @Override
            public void run() {
                he.first(hi);
            }
        });
        thrd1.start();
        thrd2.start();
    }
}
