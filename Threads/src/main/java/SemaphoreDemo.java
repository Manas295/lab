import java.util.concurrent.Semaphore;

/*
 * 
A semaphore controls access to a shared resource through the use of a counter. 
If the counter is greater than zero, then access is allowed. If it is zero, 
then access is denied. 
What the counter is counting are permits that allow access to the shared resource. 
Thus, to access the resource, a thread must be granted a permit from the semaphore.
 */

public class SemaphoreDemo {

	public static Semaphore semaphore;
	
	
	public static void main(String[] args) {
		semaphore	= new Semaphore(2); //Only 2 thread will run at a time.
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
	
	public static Thread thread1	= new Thread() {
		
		public void run() {
			try {
				semaphore.acquire();
				System.out.println("Permit acquired by thread one");
				for(int i=0;i<5;i++) {
					System.out.println("This is thread one");
					Thread.sleep(1000);
				}
				System.out.println("Thread one completes");
				semaphore.release();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	};

	public static Thread thread2	= new Thread() {
		
		public void run() {
			try {
				semaphore.acquire();
				System.out.println("Permit acquired by thread two");
				for(int i=0;i<5;i++) {
					System.out.println("This is thread two");
					Thread.sleep(1000);
				}
				System.out.println("Thread two completes");
				semaphore.release();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	};
	
	public static Thread thread3	= new Thread() {
		
		public void run() {
			try {
				semaphore.acquire();
				System.out.println("Permit acquired by thread three");
				for(int i=0;i<5;i++) {
					System.out.println("This is thread three");
					Thread.sleep(1000);
				}
				System.out.println("Thread three completes");
				semaphore.release();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	};
	
	public static Thread thread4	= new Thread() {
		
		public void run() {
			try {
				semaphore.acquire();
				System.out.println("Permit acquired by thread four");
				for(int i=0;i<5;i++) {
					System.out.println("This is thread four");
					Thread.sleep(1000);
				}
				System.out.println("Thread four completes");
				semaphore.release();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	};
	
	public static Thread thread5	= new Thread() {
		
		public void run() {
			try {
				semaphore.acquire();
				System.out.println("Permit acquired by thread five");
				for(int i=0;i<5;i++) {
					System.out.println("This is thread five");
					Thread.sleep(1000);
				}
				System.out.println("Thread five completes");
				semaphore.release();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	};
	
}

