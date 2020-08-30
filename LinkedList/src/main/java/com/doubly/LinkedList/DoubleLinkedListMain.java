package com.doubly.LinkedList;

public class DoubleLinkedListMain {
 
 public static void main(String args[])
 {
   DoublyLinkedList myLinkedlist = new DoublyLinkedList();
   myLinkedlist.insertFirst(5);
   myLinkedlist.insertFirst(6);
   myLinkedlist.insertFirst(7);
   myLinkedlist.insertFirst(1);
   myLinkedlist.insertLast(2);
   myLinkedlist.printLinkedListForward();
   myLinkedlist.printLinkedListBackward();
   
   System.out.println("================");
   // Doubly Linked list will be 
   // 1 ->  7 -> 6 -> 5 -> 2
   
   Node node=new Node();
   node.data=1;
   myLinkedlist.deleteAfter(node);
   myLinkedlist.printLinkedListForward();
   myLinkedlist.printLinkedListBackward();
   // After deleting node after 1,doubly Linked list will be 
   // 2 -> 1 -> 6 -> 5
   System.out.println("================");
   myLinkedlist.deleteFirst();
   myLinkedlist.deleteLast();
   
   // After performing above operation, doubly Linked list will be 
   //  6 -> 5
   myLinkedlist.printLinkedListForward();
   myLinkedlist.printLinkedListBackward();
 }
}