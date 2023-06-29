package com.practice.example.Collectionapima;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> stackList;
    public Stack() {
        stackList = new ArrayList<>();
    }
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
    public void push(int value) {
        stackList.add(0, value);
        System.out.println(value + " pushed onto the stack.");
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty Cannot pop element.");
            return -1;
        }
        int poppedValue = stackList.remove(0);
        System.out.println(poppedValue + " popped from the stack.");
        return poppedValue;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty No element to peek.");
            return -1;
        }
        return stackList.get(0);
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = 0; i < stackList.size(); i++) {
            System.out.print(stackList.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Stack stack = new Stack();
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));
        }

        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Top element: " + stack.peek());
    }
}
