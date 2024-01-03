package com.practice.example.learning.staticKeyword;

class StaticExample {
    static{
        System.out.println("StaticExample static block");
        str="Test";
        setCount(2);
    }
    static{
        System.out.println("StaticExample static block2");
    }
    private static int count;
    public static String str;
    public int getCount() {
        return count;
    }
    public static void setCount(int count) {
        if(count > 0)
            StaticExample.count = count;
    }
    public static int addInts(int i, int...js){//0----10
        int sum=i;
        for(int x : js) {
            sum += x;
        }
        return sum;
    }
    public static class MyStaticClass{
        public int count;
    }
}
