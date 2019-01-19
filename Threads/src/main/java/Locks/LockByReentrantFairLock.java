package Locks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockByReentrantFairLock {

	public static void main(String[] args) {
		Lock lock			= new ReentrantLock(true); // True parameter is use to define fairness.
		
		SomeRunnableTask someRunnableTask;
	
		ExecutorService threadPool	= Executors.newFixedThreadPool(100);
		
		for(int i=0;i<50;i++) {
			someRunnableTask	= new SomeRunnableTask(lock);
			threadPool.execute(someRunnableTask);
		}
		
		//threadPool.shutdown();	
	}
}

class SomeRunnableTask implements Runnable{

	Lock lock;
	
	public SomeRunnableTask(Lock lock) {
		this.lock		= lock;
	}
	
	public void run() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
