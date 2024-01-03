package com.practice.example.learning.java8.callByMethod;

@FunctionalInterface
interface Parser {
    String parse(String str);
}
class StringParser {
    public String convert(String str){
        if(str.length() <=3){
            str = str.toUpperCase();
        } else{
            str = str.toLowerCase();
        }
        return str;
    }
}
class MyPrinter {
    public void print(String str,Parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}
public class CallByMethodExample {
    public static void main(String[] args) {
        StringParser sp = new StringParser();
        String str = "MOHAN";
        MyPrinter mp = new MyPrinter();
        mp.print(str,(sp::convert));
        mp.print(str, new Parser() {
            @Override
            public String parse(String str) {
                return sp.convert(str);
            }
        });
        mp.print(str, s-> sp.convert(s));
    }
}
