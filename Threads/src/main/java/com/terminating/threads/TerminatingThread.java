package com.terminating.threads;
import java.io.IOException;

/*
 * Main thread started Thread-1, execution control entered while loop and we checked boolean variable 
 * continueThread which was true and we kept on running Thread-1, but main thread was running 
 * intermittently and waiting for user to press enter (i.e. main thread was in waiting state). 
 * Now, the question comes how main thread entered from running to waiting state, 
 * well the answer is System.in.read() caused it, and as soon as user pressed enter, 
 * continueThread’s value was changed to true and Thread-1’s if condition was no more 
 * satisfied and we breaked while loop from else and Thread-1 went into dead state.
 */
public class TerminatingThread {
	public static void main(String[] args) throws IOException {
		MyRunnable obj = new MyRunnable();
		Thread t = new Thread(obj,"Thread-1");
		t.start();

		System.out.println(Thread.currentThread().getName()
				+" thread waiting for user to press enter");
		System.in.read();
		obj.continueThread = false;

		System.out.println(Thread.currentThread().getName()+" thread ENDED");
	}
}

class MyRunnable implements Runnable {

	boolean continueThread=true;

	public void run() {
		int i = 0;
		while (true)

			if (continueThread) {
				try {
					System.out.println(i++);
					Thread.sleep(1000);
					System.out.println("Please press enter key to stop "
							+Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else{
				System.out.println(Thread.currentThread().getName()+" ENDED");
				break;
			}
	}

}