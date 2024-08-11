import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) throws Exception {

		int totalParties	= 3;
		
		CyclicBarrierAction cyclicBarrierAction	= new CyclicBarrierAction();
		
		CyclicBarrier cyclicBarrier	= new CyclicBarrier(totalParties,cyclicBarrierAction);

		MyWorker myWorker	= new MyWorker(cyclicBarrier,2000l);
		MyWorker myWorker1	= new MyWorker(cyclicBarrier,2000l);
		MyWorker myWorker2	= new MyWorker(cyclicBarrier,2000L);

		WillRunWhenBarrierIsBroken barrierIsBroken	= new WillRunWhenBarrierIsBroken(cyclicBarrier);
		barrierIsBroken.start();
		
		ThisWillBreakTheBarrier breakTheBarrier	= new ThisWillBreakTheBarrier(cyclicBarrier);
		
		myWorker.start();
		myWorker1.start();
		myWorker2.start();

		//Total parties are 4 ad only 3 await() methods are called.
		
		breakTheBarrier.start();  // An exception will be thrown on myWorker,myWorker1 and myWorker2 where await() is called.
		//In myWorker3 await is not called yet.


	}
}


class MyWorker extends Thread{

	CyclicBarrier cyclicBarrier;
	Long sleeptime;
	public MyWorker(CyclicBarrier cyclicBarrier,Long sleepTime) {
		this.cyclicBarrier	= cyclicBarrier;
		this.sleeptime		= sleepTime;
	}
	public void run() {

		
		try {
			System.out.println(Thread.currentThread().getName()+" called await");
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName()+" continues its work");
			Thread.sleep(sleeptime);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			System.out.println(Thread.currentThread().getName()+ " Barrier is broken ");
		}
	}
}

class WillRunWhenBarrierIsBroken extends Thread{
	CyclicBarrier cyclicBarrier;

	public WillRunWhenBarrierIsBroken(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier	= cyclicBarrier;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+" is waiting for barrier to get broken");
		while(true) {
			if(cyclicBarrier.isBroken()) {
				System.out.println("Barrier broken .. "+Thread.currentThread().getName()+" is free now");
				break;
			}
		}
	}
}

class ThisWillBreakTheBarrier extends Thread{
	CyclicBarrier cyclicBarrier;
	public ThisWillBreakTheBarrier(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier	= cyclicBarrier;
	}

	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" rest the barrier now ");
			cyclicBarrier.reset();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}

class CyclicBarrierAction extends Thread{
	public void run() {
		System.out.println("Barrier is done.,,,,");
	}
}