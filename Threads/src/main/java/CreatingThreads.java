
public class CreatingThreads {
	public static void main(String[] args) {
	
		ByExdendingThreadClass byThreadClass 	= new ByExdendingThreadClass();
		byThreadClass.start();
		
		ByImplementingRunnable byRunnable		= new ByImplementingRunnable();
		Thread thread	= new Thread(byRunnable);
		thread.start();
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