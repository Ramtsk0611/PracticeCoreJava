package com.practice.example.learning.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer2 {
    void update();
    void subscribeChannel(Channel ch);
}
interface Subject2 {
    void subscribe(Observer2 observer);

    void unSubscribe(Observer2 observer);

    void notifySubscribers();
    void upload(String title);

}

class Subscriber implements Observer2 {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hey "+name+", Video uploaded : "+channel.getTitle());
    }
    @Override
    public void subscribeChannel(Channel ch){
        this.channel = ch;
    }
}
class Channel implements Subject2{
    private List<Observer2> subs = new ArrayList<>();

    private String title;
    public void subscribe(Observer2 sub){
        subs.add(sub);

    }
    public void unSubscribe(Observer2 sub){
        subs.remove(sub);
    }
    public void notifySubscribers(){
        for(Observer2 sub : subs){
            sub.update();
        }
    }
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
    public String getTitle() {
        return title;
    }
}
public class ObserverPatternExcample2 {
    public static void main(String[] args) {
        Channel harshav = new Channel();
        Observer2 s1 = new Subscriber("User1");
        Observer2 s2 = new Subscriber("User2");
        Observer2 s3 = new Subscriber("User3");
        Observer2 s4 = new Subscriber("User4");
        Observer2 s5 = new Subscriber("User5");
        Observer2 s6 = new Subscriber("User6");

        harshav.subscribe(s1);
        harshav.subscribe(s2);
        harshav.subscribe(s3);
        harshav.subscribe(s4);
        harshav.subscribe(s5);
        harshav.subscribe(s6);

        harshav.unSubscribe(s3);

        s1.subscribeChannel(harshav);
        s2.subscribeChannel(harshav);
        s3.subscribeChannel(harshav);
        s4.subscribeChannel(harshav);
        s5.subscribeChannel(harshav);
        s6.subscribeChannel(harshav);

        harshav.upload("How to Learn Design Pattern in Java...");
    }
}
