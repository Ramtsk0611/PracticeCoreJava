package com.practice.example.learning.collectionAPI.linkedListImple.doublyList;

public class TestDoublyLinkedList {
    public static void main(String[] args)
    {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insertAtEnd(1);
        dlist.insertAtEnd(2);
        dlist.insertAtEnd(3);
        dlist.insertAtEnd(4);
        dlist.insertAtEnd(5);

        System.out.print("After insertion at tail: ");
        dlist.display();

        System.out.print("After insertion at head: ");
        dlist.insertAtBeginning(0);
        dlist.display();

        dlist.insertAtPosition(6, 2);
        System.out.print(
                "After insertion at 2nd position: ");
        dlist.display();

        dlist.deleteAtBeginning();
        System.out.print(
                "After deletion at the beginning: ");
        dlist.display();

        dlist.deleteAtEnd();
        System.out.print("After deletion at the end: ");
        dlist.display();

        dlist.delete(2);
        System.out.print(
                "After deletion at 2nd position: ");
        dlist.display();
    }
}
