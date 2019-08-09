package com.IntersectionNode;
class LinkedList {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}


	}
	int getNode()
	{
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d=0;
		if(c1>c2)
		{
			d = c1 - c2;
			return _getIntesectionNode(d, head1, head2);
		}
		else
		{
			d = c2 - c1;
			return _getIntesectionNode(d, head2, head1);

		}
	}
	int getCount(Node head)
	{
		Node Current  = head;
		int count=0;
		while(Current!=null)
		{
			count++;
			Current = Current.next;
		}
		return count;
	}
	public int _getIntesectionNode(int diff,Node head1,Node head2)
	{
		Node current1 = head1;
		Node current2 = head2;
		for(int i=0;i<diff;i++)
		{
			if(current1 == null)
			{
				return -1;
			}
			System.out.println("Current 1 data "+current1.data);
			current1 = current1.next;
		}
		while(current1!=null && current2!=null)
		{
			if(current1.data == current2.data)
			{
				return current1.data;
			}
			current1=current1.next;
			current2=current2.next;
		}
		return -1;

	}
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// creating first linked list
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(15);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		// creating second linked list
		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);

		System.out.println("The node of intersection is " + list.getNode());

	}
}