import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Queue {
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int currentSize;
	public Queue(int size){
		this.maxSize = size;
		this.queueArray = new int[size];
		front = 0;
		rear = -1;
		currentSize = 0;
	}
	public void insert(int item){
		//check if queue is already full
		if(isQueueFull().test(maxSize, currentSize)){
			System.out.println("Queue is full!");
			return;
		}
		// for wrapping the queue in case 
		//  max size has reached
		if(rear == maxSize - 1){
			rear = -1;
		}
		// increment rear then insert item
		queueArray[++rear] = item;
		currentSize++;
		System.out.println("Added to queue" + item);
	}

	public int remove(){
		//check if queue is empty
		if(isQueueEmpty().test(currentSize)){
			throw new RuntimeException("Queue is empty");
		}
		//System.out.println("front= " + front + " maxSize= "+maxSize);
		// retrieve item then increment
		int temp = queueArray[front++];
		if(front == maxSize){
			front = 0;
		}
		currentSize--;
		return temp;
	}
	public int peek(){
		return queueArray[front];
	}

	public BiPredicate<Integer,Integer> isQueueFull(){return (maxSize,currentSize) -> (maxSize == currentSize);}


	public Predicate<Integer> isQueueEmpty(){return currentSize -> (currentSize == 0);}

	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.insert(2);
		queue.insert(3);
		System.out.println("Item removed- " + queue.remove());
		System.out.println("Item removed- " + queue.remove());
		queue.insert(5);    
		System.out.println("Item removed- " + queue.remove());

	}
}