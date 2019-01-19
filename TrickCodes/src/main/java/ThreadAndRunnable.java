/*
 * No issue in extending Thread class and implementing Runnable interface at the same class.
 * After implementing Runnable class we dont even have to override run method forcefully 
 */
public class ThreadAndRunnable extends Thread implements Runnable {
	public static void main(String[] args) {
		ThreadAndRunnable threadClass	= new ThreadAndRunnable();
		threadClass.run();
	}
}

class MyThread extends Thread implements Runnable{
}
