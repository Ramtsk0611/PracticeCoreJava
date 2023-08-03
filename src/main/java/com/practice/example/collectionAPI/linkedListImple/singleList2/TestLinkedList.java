package com.practice.example.collectionAPI.linkedListImple.singleList2;

public class TestLinkedList {
    public static void main(String[] args) {
            LinkedList obj = new LinkedList();
            obj.insert(1);
            obj.insert(2);
            obj.insert(3);
            obj.insert( 4);
            obj.insert(5);
            obj.insert(6);
            obj.insert( 7);
//            obj.printList();
//            obj.deleteByKey(1);
//            obj.printList();
//            obj.deleteByKey(5);
//            obj.printList();
//            obj.deleteByKey(7);
//            obj.printList();
            obj.inertByIndex(44,3);
            obj.printList();
    }
}
