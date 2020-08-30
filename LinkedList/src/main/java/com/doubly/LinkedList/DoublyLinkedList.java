package com.doubly.LinkedList;
public class DoublyLinkedList {
 
	private Node head;
	private Node tail;
	int size;
 
	public boolean isEmpty() {
		return (head == null);
	}
	// For printing Doubly Linked List forward
	public void printLinkedListForward() {
		System.out.println("Printing Doubly LinkedList (head --> tail) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}
 
	// For printing Doubly Linked List forward
	public void printLinkedListBackward() {
		System.out.println("Printing Doubly LinkedList (tail --> head) ");
		Node current = tail;
		while (current != null) {
			current.displayNodeData();
			current = current.prev;
		}
		System.out.println();
	}
	public void insertFirst(int data) {
		
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.next = head;
		newNode.prev=null;
		if(head !=null) {
			head.prev = newNode;
		}
		head = newNode;
		if(tail==null) {
			tail = newNode;
		}
		size++;
	}
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.prev=tail;
		if(tail !=null) {
			tail.next = newNode;
		}
		tail = newNode;
		if(head ==null) {
			head = newNode;
		}
		size++;
	}
	public void deleteAfter(Node after) {
		Node temp = head;
		while(temp.next!=null && temp.data !=after.data) {
			temp = temp.next;
		}
		if(temp.next !=null) {
			temp.next.next.prev = temp;
		}
		temp.next = temp.next.next;
		size--;
	}
	public Node deleteFirst() {
		if (size == 0) 
			throw new RuntimeException("Doubly linked list is already empty");
		Node temp = head;
		head = head.next;
		head.prev = null;
		size--;
		return temp;
	}
	public Node deleteLast() {
		Node temp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		return temp;
	}
}