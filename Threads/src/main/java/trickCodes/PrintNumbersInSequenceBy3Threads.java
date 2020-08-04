package trickCodes;

public class PrintNumbersInSequenceBy3Threads {
	static volatile int counter	= 0;

	public static void main(String[] args) {

		Object obj	= new Object();
		Object obj2	= new Object();
		//Object obj3	= new Object();

		Thread t1	= new Thread(new SomeRunnableTask(obj, obj2));
		Thread t2	= new Thread(new SomeRunnableTask(obj2,obj));//obj3));
		//Thread t3	= new Thread(new SomeRunnableTask(obj3, obj));

		t1.start();
		t2.start();
	//	t3.start();
		
		try {
			Thread.sleep(1000);
			synchronized (obj) {
				obj.notify();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class SomeRunnableTask implements Runnable{


	Object resource1;
	Object resource2;

	public SomeRunnableTask(Object resource1,Object resource2) {
		this.resource1	= resource1;
		this.resource2	= resource2;
	}

	public void run() {

		while(PrintNumbersInSequenceBy3Threads.counter < 10) {
			synchronized (resource1) {
				try {
					resource1.wait();
					System.out.println(Thread.currentThread().getName()+" - "+PrintNumbersInSequenceBy3Threads.counter);
					PrintNumbersInSequenceBy3Threads.counter= PrintNumbersInSequenceBy3Threads.counter + 1;
					synchronized (resource2) {
						resource2.notify();
						/*
						 * You can't wait() on an object unless the current thread owns that object's monitor. 
						 * To do that, you must synchronize on it:
						 * The same rule applies to notify()/notifyAll() as well.
						 */
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
