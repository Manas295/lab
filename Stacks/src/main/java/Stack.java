import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Stack {

	private int maxSize;
	private int[] stackArray;
	private int top;
	Stack(int size){
		this.maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}
	public void push(int item){
		if(top>=maxSize-1) {
			System.out.println("Stack already full..");
			return;
		}
		stackArray[++top] = item;

	}
	public int pop(){
		if(top<0) {
			throw new RuntimeException("Stack is Empty");
		}
		return stackArray[top--];
	}
	public int peek(){
		// return top item value
		return stackArray[top];
	}

	public boolean isFull(){
		return (top == maxSize - 1);
	}
	public static Predicate<Integer> isEmpty(){ return top -> (top<0);}

	public static void main(String[] args) {
		Stack stack = new Stack(20);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
	//	Arrays.stream(stack.stackArray).forEach(e -> System.out.println("Element-> "+e));
		System.out.println("Item popped- " + stack.pop());
		System.out.println("Item popped- " + stack.pop());
		while(!isEmpty().test(stack.top)){
			System.out.println("Item popped----- " + stack.pop());
		}
	}
}
