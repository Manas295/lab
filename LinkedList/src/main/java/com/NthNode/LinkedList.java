package com.NthNode;

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
	public int findNthNode(int x)
	{
		int count=0;
		Node current = head;
		while(current.next!=null)
		{
			if(count == x)
				return current.data;
			current = current.next;
			count++;
		}
		return -1;
	}
	public static void main(String[] args) {

		int index = 8;
		LinkedList llist = new LinkedList();
		for(int i=10;i>0;i--)
		{
			llist.push(i);
		}
		int result = llist.findNthNode(index);
		if(result==-1)
			System.out.println("Wrong Index");
		else
			System.out.println("Index  Found  and Value at Index "+index+" is :"+result);
		llist.printList();
		
		int lastNode = llist.findLastNode();
		System.out.println("Last Node -> "+lastNode);
	}

	 int findLastNode() 
	{ 
		 Node h = head;
		if (h == null) 
			return -1; 

		if (h.next == null) { 
			return h.data; 
		} 

		// Find the second last node 
		Node second_last = h; 
		while (second_last.next.next != null) 
			second_last = second_last.next; 

		// Change next of second last 
		//second_last.next = null; 

		return second_last.next.data; 
	} 
}