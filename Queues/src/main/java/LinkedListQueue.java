import java.util.function.Predicate;


public class LinkedListQueue {
	Node front;
	Node rear;
	public LinkedListQueue(){
		front = null;
		rear = null;
	}
	// Class for node
	private class Node{
		//data
		int i;
		Node next;
		Node(int i){
			this.i = i;
		}
		public void displayData(){
			System.out.println("i= " + i);
		}
	}
	/** Linked list operations, keeping them separate from 
	 * Queue operations
	 * */
	public void insertLast(int i){
		Node newNode = new Node(i);
		if(isEmpty().test(front)){
			front = newNode;
		}else{
			// previous last point to new node
			rear.next = newNode;
		}
		rear = newNode;
	}

	public int removeFirst(){  

		int temp = front.i;
		// If no node left after deleting node
		if(front.next == null){
			rear = null;
		}
		// front starts pointing to next element
		front = front.next;
		return temp;
	}

	// Method to traverse and display all nodes
	public void displayList(){
		// Start from first node
		Node current = front;
		// loop till last node
		while(current != null){
			current.displayData();
			current = current.next;
		}
	}

	public int nodeData(){
		return front.i;
	}

	public Predicate<Node> isEmpty(){ return front -> (front == null);}

	/** Queue operations */
	public void insert(int item){
		insertLast(item);
	}

	public int remove(){
		if(isEmpty().test(front)){
			throw new RuntimeException("Queue is empty..");
		}
		return removeFirst();
	}

	public int peek(){
		if(isEmpty().test(front)){
			throw new RuntimeException("Queue is empty..");
		}
		return nodeData();
	}

	public static void main(String[] args) {
		LinkedListQueue queue = new LinkedListQueue();
		queue.insert(3);
		queue.insert(6);
		System.out.println("-- Displaying Queue data--");
		queue.displayList();
		System.out.println("Item peeked- " + queue.peek());
		System.out.println("-- Removing Queue elements--");
		System.out.println("Item removed- " + queue.remove());
		System.out.println("Item removed- " + queue.remove());
	}
}