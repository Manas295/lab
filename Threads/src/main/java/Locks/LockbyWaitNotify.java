package Locks;

import java.util.LinkedList;
import java.util.Random;

public class LockbyWaitNotify {
	public static void main(String[] args) {

		LinkedList<Integer>  linkedList = new LinkedList<Integer>();
		int maxSize = 10;
		Producer producer = new Producer(linkedList, maxSize);
		Consumer consumer = new Consumer(linkedList, maxSize);
		producer.start();
		consumer.start();

	}
}

class Producer extends Thread
{
	LinkedList<Integer> linkedList;
	int maxSize;
	public Producer(LinkedList<Integer> linkedList , int maxSize)
	{
		this.linkedList = linkedList;
		this.maxSize 	= maxSize;
	}	


	@Override
	public void run() {
		while(true)
		{
			synchronized (linkedList) {
				while(linkedList.size() == maxSize)
				{
					System.out.println("LinkedList full waiting for consumer to consume");
					try {
						linkedList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing value : " + i);
                linkedList.add(i);
                linkedList.notifyAll();

			}
		}
	}
}
class Consumer extends Thread
{
	LinkedList<Integer> linkedList;
	int maxSize;
	public Consumer(LinkedList<Integer> linkedList , int maxSize)
	{
		this.linkedList = linkedList;
		this.maxSize 	= maxSize;
	}	


	@Override
	public void run() {
		while(true)
		{
			synchronized (linkedList) {
				while(linkedList.isEmpty())
				{
					System.out.println("LinkedList empty waiting for producer to produce");
					try {
						linkedList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consuming value : " + linkedList.remove());
                linkedList.notifyAll();
			}
		}
	}
}