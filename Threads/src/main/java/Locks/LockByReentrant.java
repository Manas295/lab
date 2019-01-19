package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utillity.Consumer;
import utillity.Producer;
import utillity.Resource;

public class LockByReentrant {

	public static void main(String[] args) {

		Lock lock	= new ReentrantLock();

		Producer	producer	= new Producer();
		Consumer	consumer	= new Consumer();

		Resource	resource	= new Resource();

		producer.setResource(resource,lock);
		consumer.setResource(resource,lock);

		consumer.start();
		producer.start();
	}
}


