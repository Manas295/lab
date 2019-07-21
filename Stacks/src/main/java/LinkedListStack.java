import java.util.function.Consumer;
import java.util.function.Predicate;

public class LinkedListStack {
    //Reference for the top of the stack
    Node top;
    public LinkedListStack(){
        top = null;
    }
    //Class representing each node
    private class Node{
        //data
        int i;
        //ref to next node
        Node next;
        Node(int i){
            this.i = i;
        }

		/*
		 * public void displayData(){ System.out.println("i= " + i); }
		 */
        public Consumer<Node> displayData = (node) -> System.out.println("i= "+node.i);
    }
    
    public void insertNode(int i){
        //Create a new node
        Node newNode = new Node(i);
        // current top is pushed down
        newNode.next = top;
        // newly inserted node is referenced by top
        top = newNode;
    }
    
    public int removeNode(){        
        Node temp = top;
        // Next item in the stack is referenced by top
        top = top.next;
        return temp.i;
    }
    
    public int nodeData(){
        return top.i;
    }
    
	/*
	 * public boolean isEmpty(){ return top == null; }
	 */
    public static Predicate<Node> isEmpty(){ return top -> (top == null);}
    
    public void push(int item){
        insertNode(item);
    }
    public int pop(){
        // If no item is inserted
        if(isEmpty().test(top)){
            throw new RuntimeException("Stack is Empty");
        }
        return removeNode();
    }
    
    public int peek(){
        // If no item is inserted
        if(isEmpty().test(top)){
            throw new RuntimeException("Stack is Empty");
        }
        return nodeData();
    }
    
    public void displayStack(){
        // start from the top
        Node current = top;
        // traverse the list
        while(current != null){
            //current.displayData();
        	current.displayData.accept(current);
        	current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Item peeked- " + stack.peek());
        System.out.println("Items in stack--");
        stack.displayStack();
        System.out.println("Item popped- " + stack.pop());
        System.out.println("Item popped- " + stack.pop());
        System.out.println("Item peeked- " + stack.peek());
        System.out.println("Items in stack--");
        stack.displayStack();
    }
}