package com.practice.example.learning.collectionAPI.linkedListImple.singlyList;

public class LinkedList {
    Node head;
    public LinkedList insert(LinkedList list, int data) {//1,2,3
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;//1
        } else {
            Node last = list.head;
            while (last.next != null) {//2nd node
                last = last.next;
            }
            last.next = new_node;//2
        }
        return list;
    }
    public LinkedList inertByIndex(LinkedList list, int data, int index){
        Node new_node = new Node(data); Node prev = null;
        if(index == 0) {
            list.head = new_node;
        }
        else {
            int count = 0;
            Node temp = list.head;
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
        return list;
    }


    public void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public LinkedList  deleteByKey(LinkedList list, int key){//1,2,3,4,5---->5
        Node currNode = list.head;
        Node prev = null;
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head
            System.out.println(key + " found and deleted");
            return list;
        }
        while (currNode != null && currNode.data != key) {//1,2,3,4,5
            prev = currNode;//1,2,3
            currNode = currNode.next;//2,3,4
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }



}