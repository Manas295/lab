package Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import utillity.Consumer;
import utillity.Producer;
import utillity.Resource;

public class LockByScnchronization {
	
	public static void main(String[] args) {

		Producer	producer	= new Producer();
		Consumer	consumer	= new Consumer();

		Resource	resource	= new Resource();
		
		Lock lock	= new MySynchronizedLock();

		producer.setResource(resource,lock);
		consumer.setResource(resource,lock);

		consumer.start();
		producer.start();
	}
}

class MySynchronizedLock implements Lock{

	boolean isAlreadyLocked	= false;

	public void lock() {
		synchronized(this) {
			try {
				while(isAlreadyLocked) {
					wait();
				}
				isAlreadyLocked	= true;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void unlock() {
		synchronized (this) {
			isAlreadyLocked	= false;
			notify();
		}
	}

	public void lockInterruptibly() throws InterruptedException {
		// TODO Auto-generated method stub
	}

	public boolean tryLock() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}
}

