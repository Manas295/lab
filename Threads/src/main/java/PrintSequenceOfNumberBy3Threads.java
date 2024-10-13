class SharedNumber {
	//  private int currentNumber = 1;
	volatile static int currentNumber = 1; 

	private final int maxNumber;

	public SharedNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public synchronized void printNumber(int threadId) {
		while (currentNumber <= maxNumber) {
			if (currentNumber % 3 != threadId) {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					throw new RuntimeException(e);
				}
			}
			if (currentNumber <= maxNumber) {
				System.out.println("Thread " + (threadId + 1) + ": " + currentNumber);
				currentNumber++;
				notifyAll();
			}
		}
	}
}

class NumberPrinter implements Runnable {
	private final SharedNumber sharedNumber;
	private final int threadId;

	public NumberPrinter(SharedNumber sharedNumber, int threadId) {
		this.sharedNumber = sharedNumber;
		this.threadId = threadId;
	}

	@Override
	public void run() {
		sharedNumber.printNumber(threadId);
	}
}

public class PrintSequenceOfNumberBy3Threads {
	public static void main(String[] args) {
		SharedNumber sharedNumber = new SharedNumber(30);

		Thread thread1 = new Thread(new NumberPrinter(sharedNumber, 1), "Thread 1");
		Thread thread2 = new Thread(new NumberPrinter(sharedNumber, 2), "Thread 2");
		Thread thread3 = new Thread(new NumberPrinter(sharedNumber, 0), "Thread 3");

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
