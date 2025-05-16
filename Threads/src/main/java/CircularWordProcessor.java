import java.util.concurrent.BlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;


public class CircularWordProcessor {

	private static final int THREAD_COUNT = 4; // Number of threads

	static class Worker implements Runnable {
		private final BlockingQueue<String> inputQueue;
		private final BlockingQueue<String> outputQueue;

		public Worker(BlockingQueue<String> inputQueue, BlockingQueue<String> outputQueue) {
			this.inputQueue = inputQueue;
			this.outputQueue = outputQueue;
		}

		@Override
		public void run() {
			try {
				while (true) {
					// Take data from the input queue (blocking if empty)
					String data = inputQueue.take();
					if (data.isEmpty()) {
						// Signal termination to next thread
						outputQueue.put("");
						break;
					}
					// Process the first word and pass the remainder
					int spaceIndex = data.indexOf(' ');
					if (spaceIndex == -1) {
						// Last word: Print and signal termination
						System.out.println(Thread.currentThread().getName() + ": " + data);
						outputQueue.put("");
						break;
					} else {
						String word = data.substring(0, spaceIndex);
						String remaining = data.substring(spaceIndex + 1);
						System.out.println(Thread.currentThread().getName() + ": " + word);

						// Pass the remainder to the output queue
						outputQueue.put(remaining);
					}
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		String paragraph = "This is a sample paragraph for testing thread synchronization";
		/*
			This declares an array of BlockingQueue<String> objects. \
			Each element in the array is a BlockingQueue that will hold 
			strings (i.e., String objects). 
		*/
		BlockingQueue<String>[] queues = new BlockingQueue[THREAD_COUNT];

		// Initialize queues
		for (int i = 0; i < THREAD_COUNT; i++) {
			queues[i] = new LinkedBlockingQueue<>();
		}

		// Create and start threads
		for (int i = 0; i < THREAD_COUNT; i++) {
			/*
			 	Each thread’s input queue comes from one element of the queues array, 
			 	and its output queue comes from the next element in a circular order
			 	
			 	Input Queue:
						queues[i] is the queue the thread will read data from.

				Output Queue:
						queues[(i + 1) % THREAD_COUNT] is the queue the thread will write data to.

						The modulo operation (% THREAD_COUNT) ensures that the last thread’s output goes 
						back to the first thread’s input, forming a circular connection.
			--------------------------------------------------------------------------------------------
				Thread		Input Queue (queues[i])		Output Queue (queues[(i + 1) % THREAD_COUNT])
			--------------------------------------------------------------------------------------------
				Thread-0	queues[0]					queues[1]
				Thread-1	queues[1]					queues[2]
				Thread-2	queues[2]					queues[3]
				Thread-3	queues[3]					queues[0] (wraps back to the start)
			 */
			BlockingQueue<String> inputQueue = queues[i];
			BlockingQueue<String> outputQueue = queues[(i + 1) % THREAD_COUNT];
			new Thread(new Worker(inputQueue, outputQueue), "Thread-" + i).start();
		}

		// Put initial data into the first thread's input queue
		queues[0].put(paragraph);
	}
}