package com.LinkedlIst.NetJs;

class Node{
    //data
    int i;
    // Reference to next node
    Node next;
    
    public Node(int i){
        this.i = i;
        this.next = null;
    }
    public void displayData(){
        System.out.print(" " + i);
    }
}

public class LinkedListOperations {
    private Node head;
    private Node tail;
    private int size = 0;
    public LinkedListOperations(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertFirst(int i){
        //Create a new node
        Node newNode = new Node(i);
        if(isEmpty()){
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void insertLast(int i){
        Node newNode = new Node(i);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    
    public void insertAtIndex(int i, int index){
        if(!isValidIndex(index)){
            throw new IndexOutOfBoundsException("Index " + index +" not valid for linked list of size " + size);
        }
        Node newNode = new Node(i);
        Node current = head;
        Node temp = head;
        //insert at the start
        if(index == 0){
            insertFirst(i);
        }
        // insert at last
        else if(index == size){
            insertLast(i);
        }else{
            for(int j = 0; j < index && current.next != null; j++){
                temp = current;
                current = current.next;
            }
            newNode.next = current;
            temp.next = newNode;
            size++;    
        }        
    }
    
    public Node get(int index){
        if(!isValidIndex(index)){
            throw new IndexOutOfBoundsException("Index " + index +" not valid for linked list of size " + size);
        }
        Node current = head;
        for(int j = 0; j < index; j++){
            current = current.next;
        }
        return current;        
    }
    
    // Method to traverse and display all nodes
    public void displayList(){
        Node current = head;
        while(current != null){
            current.displayData();
            current = current.next;
        }
        System.out.println("");
    }
    
    public void removeFirst(){
        if(head == null){
            throw new RuntimeException("List is empty..");
        }
        // if there is only one node
        if(head.next == null){
            tail = null;
        }
        head = head.next;
        size--;
    }
    
    public void removeLast(){
        if(tail == null){
            throw new RuntimeException("List is empty..");
        }
        Node current = head;
        Node temp = head;
        // if there is only one node
        if(head.next == null){
            head = null;
        }        
        while(current != tail){
            temp = current;
            current = current.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    
    public void removeAtIndex(int index){
        if(!isValidIndex(index +1)){
            throw new IndexOutOfBoundsException("Index " + index +" not valid for linked list of size " + size);
        }
        Node current = head;
        Node temp = head;
        //remove at the start
        if(index == 0){
            removeFirst();
        }
        // remove at last
        else if(index == size - 1){
            removeLast();
        }else{
            for(int j = 0; j < index && current.next != null; j++){
                temp = current;
                current = current.next;
            }
            temp.next = current.next;
            current.next = null;
            size--;
        }
    }
    
    private boolean isValidIndex(int index){
        return index >= 0 && index <= size;
    }
    
    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        System.out.println("After insertions--");
        list.displayList();
        list.removeLast();
        System.out.println("After removal--");
        list.displayList();
		/*
		 * list.removeAtIndex(1); System.out.println("After removal--");
		 * list.displayList(); System.out.println("Get Node--"); Node node =
		 * list.get(1); node.displayData();
		 */
    }
}