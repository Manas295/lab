package com.element.search;
class LinkedList
{
	Node head;  // head of list

	/* Linked list Node*/
	static class Node
	{
		int data;
		Node next;

		// Constructor to create a new node
		// Next is by default initialized
		// as null
		Node(int d) {data = d; next=null;}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
	/* Function to print middle of linked list */

	public  void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+"-->");
			n = n.next;
		}
		System.out.println("NULL");
	}
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
                  Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;
		/* 4. Move the head to point to new Node */
		head = new_node;
	}
	public boolean searchElement(int x)
	{
		Node current = head;
		while(current.next!=null)
		{
			if(current.data == x)
				return true;
			current = current.next;
		}
		return false;
	}
	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		for(int i=10;i>0;i--)
		{
			llist.push(i);
		}

		if(llist.searchElement(5))
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		llist.printList();
	}
}