package com.practice.example.learning.designPattern.protoType.example2;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs1 = new BookShop();
        bs1.setShopName("Java");
        bs1.loadData();
        BookShop bs2 = bs1.clone();
        bs1.getBooks().remove(2);
        bs2.setShopName("Java2");
        System.out.println(bs1);
        System.out.println(bs2);
    }
}
