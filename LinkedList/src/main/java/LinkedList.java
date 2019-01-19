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
        Node(int d) {data = d;}
    }
    public  void printList()
    {
    	Node n = head;
    	while(n!=null)
    	{
    		System.out.println(n.data+"");
    		n = n.next;
    	}
    }
    public void findMiddleElement()
    {
    	Node first = head;
    	Node second = head; 
    }
    public static void main(String[] args) {
		
    	LinkedList llist = new LinkedList();
    	llist.head = new Node(1);
    	Node Second = new Node(2);
    	Node Third = new Node(3);
    	
    	llist.head.next = Second;
    	Second.next = Third;
    	llist.printList();
	}
}