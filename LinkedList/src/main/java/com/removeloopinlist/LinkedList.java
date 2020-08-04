package com.removeloopinlist;

import java.util.HashSet;



class LinkedList
{
	static Node head;  // head of list

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
	public static  boolean detectLoop(Node h)
	{
		HashSet<Node> s = new HashSet<Node>();
		while(h!=null)
		{
			if(s.contains(h))
			{
				return true;
			//	return h.data;
			}
			s.add(h);
			h = h.next;
		}
		return false;
		
	}
	public static  int detectLoopFloydsAlgo(Node h)
	{
		Node slowptr = h, fastptr=h;
		int count=0;
		while(slowptr!=null && fastptr!=null && fastptr.next!=null)
		{
			count++;
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
			if(slowptr == fastptr)
			{
				System.out.println("Loop Found & count "+count);
				//removeloop(slowptr,h);
				removeLoop(slowptr,h);
				return 1;
			}
		}
		System.out.println("Loop Not Found");
		return -1;

	}
	public static void removeloop(Node slowptr,Node h)
	{
		System.out.println("Removing Loop"+slowptr.data+" Head "+h.data);
		Node ptr1 = null,ptr2=null;
		ptr1 = h;
		while(1==1)
		{
			ptr2=slowptr;
			while(ptr2.next!=slowptr && ptr2.next!=ptr1 )
			{
				ptr2 = ptr2.next;
			}
			
			if(ptr2.next == ptr1)
			{
				break;
			}
		
			ptr1=ptr1.next;
		}
		ptr2.next=null;
	}
	// Function to remove loop 
   static void removeLoop(Node loop, Node head) 
    { 
        Node ptr1 = loop; 
        Node ptr2 = loop; 
  
        // Count the number of nodes in loop 
        int k = 1, i; 
        while (ptr1.next != ptr2) { 
            ptr1 = ptr1.next; 
            k++; 
        } 
  
        // Fix one pointer to head 
        ptr1 = head; 
  
        // And the other pointer to k nodes after head 
        ptr2 = head; 
        for (i = 0; i < k; i++) { 
            ptr2 = ptr2.next; 
        } 
  
        /*  Move both pointers at the same pace, 
         they will meet at loop starting node */
        while (ptr2 != ptr1) { 
            ptr1 = ptr1.next; 
            ptr2 = ptr2.next; 
        } 
  
        // Get pointer to the last node 
        while (ptr2.next != ptr1) { 
            ptr2 = ptr2.next; 
        } 
  
        /* Set the next node of the loop ending node 
         to fix the loop */
        ptr2.next = null; 
    } 
  
	public static void main(String[] args) 
	{
		LinkedList llist = new LinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		llist.printList();
		/*Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		/*if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");*/
		int result  = detectLoopFloydsAlgo(head);
		System.out.println("Result of Loop Check "+result);



	}
}
