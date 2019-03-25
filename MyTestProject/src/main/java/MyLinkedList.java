
public class MyLinkedList {

	public static Node head;
	public static int size;


	public static void main(String[] args) {
		MyLinkedList myLinkedList	= new MyLinkedList();

		myLinkedList.add("Piyush");
		myLinkedList.add("Arun");
		myLinkedList.add("Manas");
		myLinkedList.add("Suraj");

		System.out.println(myLinkedList.getSize());
		
		myLinkedList.printValues();
	}



	static class Node{
		String data;
		Node next;

		public Node(String data) {
			this.data	= data;
			next		= null;
		}
	}

	public void add(String data) {
		Node newNode	= new Node(data);
		
		newNode.next	= head;
		head	= newNode;
		
	}

	public int getSize() {
		int size	= 0;
		Node node	= head;

		if(node != null) {
			size	= 1;
			while(node.next!=null) {
				 size++;
				node	= node.next;
			}
		}

		return size;
	}

	public void printValues() {
		Node node	= head;

		for(int i=0;i<getSize();i++) {
			System.out.println(node.data);
			node	= node.next;
		}
	}
	
	public void insert(int position,String data) {
		Node node	= new Node(data);
		
		Node current		= head;
		Node previous;
		
		for(int i=1;i<=getSize();i++) {
			if(position == i) {
				
			}
		}
	}
}
