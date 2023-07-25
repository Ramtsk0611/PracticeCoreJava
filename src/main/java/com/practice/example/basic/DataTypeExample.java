package com.practice.example.basic;

public class DataTypeExample {
    public static void main(String args[]) {
        char a = 0;
        char ch = 'M';
        char chs = '*';

        byte b = 4;
        short s = 56;
        int in = 89;
        long l = 12121;

        float f = 4.7333434f;
        double d = 4.355453532;

        //non primitive Datatype
        int[] arr = new int[1000];//
        for(int i=0;i<arr.length;i++) {
            arr[i] = i+i+i;
            System.out.println(arr[i]);
        }





        String str = "Java";//String Literal
        String str1 = new String("Java");//String Constant Pool in Heap
//        System.out.println(str+"----"+str1);
//        System.out.println(str==str1);
//        System.out.println(str.equals(str1));
//
//        System.out.println("char: " + a);
//        System.out.println("integer: " + in);
//        System.out.println("byte: " + b);
//        System.out.println("short: " + s);
//        System.out.println("float: " + f);
//        System.out.println("double: " + d);
//        System.out.println("long: " + l);
    }
}
