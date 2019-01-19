package com.swapNodes;

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
	public void swapNodes(int x, int y)
	{
		// Nothing to do if x and y are same
		if (x == y) return;

		// Search for x (keep track of prevX and CurrX)
		Node prevX = null, currX = head;
		while (currX != null && currX.data != x)
		{
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and currY)
		Node prevY = null, currY = head;
		while (currY != null && currY.data != y)
		{
			prevY = currY;
			currY = currY.next;
		}

		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return;

		// If x is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else //make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else // make x the new head
			head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

        System.out.print("\n Linked list before calling swapNodes() ");
		llist.printList();

		llist.swapNodes(4,3);

		System.out.print("\n Linked list after calling swapNodes() ");
		llist.printList();
	}
}