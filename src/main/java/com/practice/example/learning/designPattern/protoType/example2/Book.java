package com.practice.example.learning.designPattern.protoType.example2;

public class Book {

    private int bid;
    private String bName;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bName='" + bName + '\'' +
                '}';
    }
}
