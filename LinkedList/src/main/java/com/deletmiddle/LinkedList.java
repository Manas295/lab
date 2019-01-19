package com.deletmiddle;
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
	void deleteMiddle(Node head)
	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		Node prev_ptr = null;
		if (head != null)
		{
			while (fast_ptr != null && fast_ptr.next != null)
			{
				fast_ptr = fast_ptr.next.next;
				prev_ptr = slow_ptr;
				slow_ptr = slow_ptr.next;
			}
			prev_ptr.next = slow_ptr.next;
			System.out.println("The middle element is [" +
					slow_ptr.data + "] \n");

		}
	}
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
	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		for(int i=10;i>0;i--)
		{
			llist.push(i);
		}
		llist.printList();

		llist.deleteMiddle(llist.head);
		llist.printList();
	}
}