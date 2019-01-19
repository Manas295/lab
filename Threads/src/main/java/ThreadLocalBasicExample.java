
/*
 * 
 * The ThreadLocal class in Java enables you to create variables that can only be read and written by the same thread. 
 * Thus, even if two threads are executing the same code, and the code has a reference to a ThreadLocal variable, 
 * then the two threads cannot see each other's ThreadLocal variables.
 */
public class ThreadLocalBasicExample {
	public static class MyRunnable implements Runnable{

		ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();

		@Override
		public void run() {
			threadlocal.set((int) (Math.random() * 100D));
			try {
				Thread.sleep(1000);
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
			System.out.println("ThreadLocal Value for "+Thread.currentThread().getName()+"---->"+threadlocal.get());
		}	
	};
	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable();

		Thread thread1 = new Thread(myRunnable);
		Thread thread2 = new Thread(myRunnable);
		thread1.setName("Thread-1");
		thread1.start();
		thread2.setName("Thread-2");
		thread2.start();
	}

}
