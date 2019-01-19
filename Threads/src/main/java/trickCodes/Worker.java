package trickCodes;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Worker implements Runnable{

	BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
	Worker next = null;

	public void setNext(Worker t )
	{
		this.next = t;
	}

	public void accept(int i)
	{
		queue.add(i);
	}
	@Override
	public void run() {

		while(true)
		{
			try {
				int val = queue.take();
				System.out.println(Thread.currentThread().getName() + val);
				Thread.sleep(2000);
				if(next!=null)
				{
					this.next.accept(val+1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}
	}




}