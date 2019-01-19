package threadPools;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
/**
 * newCachedThreadPool() – doesn’t put tasks into a queue. 
 * Consider this as the same as using a queue with the maximum size of 0. 
 * When all current threads are busy, 
 * it creates another thread to run the task.
 * 
 * @param args
 * @throws Exception
 */
	public static void main(String[] args) throws Exception {
		ExecutorService exService = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			SomeCallableTask someRunnableTask	= new SomeCallableTask();
			System.out.println(exService.submit(someRunnableTask).get());
		}
		exService.shutdown();
	}
}

class SomeCallableTask implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Piyush";
	}
	
}
