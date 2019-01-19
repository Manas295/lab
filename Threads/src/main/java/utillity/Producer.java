package utillity;

import java.util.concurrent.locks.Lock;

public class Producer extends Thread{
	Resource resource;
	Lock lock;
	public void setResource(Resource resource,Lock lock) {
		this.resource	=  resource;
		this.lock		= lock;
	}

	public void run() {
		produce();
	}

	public void produce(){
		try {
			for(int i=0;i<10;i++) {

				lock.lock();
				
				resource.list.add(i);
				System.out.println("Produced :: "+i);
				
				lock.unlock();

				Thread.sleep(2000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Nothing to produce.");
		System.exit(0);
	}
}
