package com.practice.example.learning.designPattern.protoType.example2;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private  String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void loadData(){
        for (int i=0;i<10;i++){
            Book b = new Book();
            b.setBid(i);
            b.setbName("Book"+i);
            getBooks().add(b);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
//        return super.clone();//Shallow Clone
        BookShop shop = new BookShop();
        for(Book b:getBooks()){
            shop.getBooks().add(b);
        }
        return shop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

}
