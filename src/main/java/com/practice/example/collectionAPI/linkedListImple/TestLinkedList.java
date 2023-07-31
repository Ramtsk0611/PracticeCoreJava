package com.practice.example.collectionAPI.linkedListImple;

public class TestLinkedList {
    public static void main(String[] args) {
            LinkedList obj = new LinkedList();
            obj.insert(obj,1);
            obj.insert(obj,2);
            obj.insert(obj,3);
            obj.insert(obj, 4);
            obj.insert(obj,5);
            obj.insert(obj,6);
            obj.insert(obj, 7);
//            obj.printList(obj);
//            obj.deleteByKey(obj,1);
//            obj.printList(obj);
//            obj.deleteByKey(obj,5);
//            obj.printList(obj);
//            obj.deleteByKey(obj,7);
//            obj.printList(obj);
            obj.inertByIndex(obj,44,3);
            obj.printList(obj);
    }
}
