
public class CreatingThreads {
	public static void main(String[] args) {
	
		ByExdendingThreadClass byThreadClass 	= new ByExdendingThreadClass();
		byThreadClass.start();
		
		ByImplementingRunnable byRunnable		= new ByImplementingRunnable();
		Thread thread	= new Thread(byRunnable);
		thread.start();
		
		ByLambdaExpressionThread  byLambdaExpressionThread =  new ByLambdaExpressionThread("Lambda Thread");
		
	}
}


class ByExdendingThreadClass extends Thread{
	
	public void run() {
		System.out.println(this.getClass().getName());
	}
}

class ByImplementingRunnable implements Runnable{

	public void run() {
		System.out.println(this.getClass().getName());
	}
}

class ByLambdaExpressionThread{
	public ByLambdaExpressionThread(String name) {
		// Lambda block - code inside the lambda block will
        // be the implementation of the run method. 
		Runnable r = () -> {
            System.out.println("Entered run method " +Thread.currentThread().getName());
            for(int i = 0; i < 5; i++){
                System.out.println("Lambda thread " + i);
            }
            System.out.println("Finished with Lambda Thread");
        };    
        //starting thread with the constructor of the thread class
        // that takes runnable instance and String as parameters
        new Thread(r, name).start();
		}
	}
