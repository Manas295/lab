package utillity;

import java.util.concurrent.locks.Lock;

public class Consumer extends Thread{
	Resource resource;
	Lock lock;
	
	public void setResource(Resource resource,Lock lock) {
		this.resource	=  resource;
		this.lock		= lock;
	}

	public void run() {
		consume();
	}

	public void consume() {
		try {
			while(true) {
				
				lock.lock();
			
				if(resource.list.isEmpty()) {
					
				}else {
					System.out.println("Polled item is :: " + resource.list.poll());
				}
				
				lock.unlock();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}