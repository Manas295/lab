import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MultipleProducerConsumerUsingBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

		Thread producer1 = new Thread(new Producer(queue, 1));
		Thread producer2 = new Thread(new Producer(queue, 2));
		Thread consumer1 = new Thread(new Consumer(queue, 1));
		Thread consumer2 = new Thread(new Consumer(queue, 2));

		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();
	}

}
class Producer implements Runnable {
	private BlockingQueue<Integer> queue;
	private int id;

	public Producer(BlockingQueue<Integer> queue, int id) {
		this.queue = queue;
		this.id = id;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				queue.put(i);
				System.out.println("Producer " + id + " produced: " + i);
				Thread.sleep((int) (Math.random() * 100));
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

class Consumer implements Runnable {
	private BlockingQueue<Integer> queue;
	private int id;

	public Consumer(BlockingQueue<Integer> queue, int id) {
		this.queue = queue;
		this.id = id;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Integer item = queue.take();
				System.out.println("Consumer " + id + " consumed: " + item);
				Thread.sleep((int) (Math.random() * 100));
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}