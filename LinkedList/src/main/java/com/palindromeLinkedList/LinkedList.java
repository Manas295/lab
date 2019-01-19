package com.palindromeLinkedList;

import java.util.Stack;

/* Java program to check if linked list is palindrome */

class LinkedList 
{
	Stack<Character> stk= new Stack<Character>();
	Node head;  // head of list
	Node slow_ptr, fast_ptr,second_half;

	/* Linked list Node*/
	class Node 
	{
		char data;
		Node next;

		Node(char d) 
		{
			data = d;
			next = null;
		}
	}
	public void push(char new_data) 
	{
		/* Allocate the Node &
           Put in the data */
		Node new_node = new Node(new_data);

		/* link the old list off the new one */
		new_node.next = head;

		/* Move the head to point to new Node */
		head = new_node;
	}

	// A utility function to print a given linked list
	void printList(Node ptr) 
	{
		while (ptr != null) 
		{
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

	void pushInStack(Node ptr)
	{

		while (ptr!=null)
		{
			stk.push(ptr.data);
			ptr = ptr.next;
		}
	}
	boolean isPalindrome(Node ptr)
	{
		while(ptr !=null)
		{
			char ch = stk.pop();
			System.out.println("POPPED ELEMENT "+ch);
			if(ch == ptr.data)
			{
				ptr = ptr.next;
				
			}
			else
				return false;
		}
		return true;
	}

	/* Driver program to test the above functions */
	public static void main(String[] args) {

		/* Start with the empty list */
		LinkedList llist = new LinkedList();

		char str[] = {'R', 'A', 'D', 'A', 'R'};
		String string = new String(str);
		for (int i = 0; i< str.length ; i++) {
			llist.push(str[i]);
		}
		llist.printList(llist.head);
		llist.pushInStack(llist.head);
		if (llist.isPalindrome(llist.head))
		{
			System.out.println("Is Palindrome");
			System.out.println("");
		}
		else
		{
			System.out.println("Not Palindrome");
			System.out.println("");
		}
	}
}