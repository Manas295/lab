package threadPools;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService	= Executors.newFixedThreadPool(10); //Created executors of size 10
		
		Future future = null;
		for(int i=0;i<10;i++) {
			future	= executorService.submit(new someRunnableTaskToExecute());
		}
	}
}

class someRunnableTaskToExecute implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}