package com.practice.example.learning.collectionAPI.linkedListImple.singleList2;

public class LinkedList {
    Node head;
    public void insert(int data) {//1,2,3
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;//1
        } else {
            Node last = head;
            while (last.next != null) {//2nd node
                last = last.next;
            }
            last.next = new_node;//2
        }
    }
    public void inertByIndex(int data, int index){
        Node new_node = new Node(data); Node prev = null;
        if(index == 0) {
            head = new_node;
        }
        else {
            int count = 0;
            Node temp = head;
            while(temp.next != null){
                if(count==index){
                    prev.next = new_node;
                    new_node.next = temp;
                } else {
                    prev = temp;//1,2,3
                    temp = temp.next;
                }
                count++;
            }
        }
    }
    public void printList() {
        Node currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public void deleteByKey(int key){
        Node currNode = head;
        Node prev = null;
        if (currNode != null && currNode.data == key) {
            head = currNode.next; // Changed head
            System.out.println(key + " found and deleted");
            return;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }
    }
}