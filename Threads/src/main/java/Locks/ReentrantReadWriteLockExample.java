package Locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockExample {

	public static void main(String[] args) {

		AtomicInteger someNumber	= new AtomicInteger(0);

		ReentrantReadWriteLock readWriteLock	= new ReentrantReadWriteLock();

		Lock writingLock	= readWriteLock.writeLock();
		Lock readingLock	= readWriteLock.readLock();

		ExecutorService writingThreadPool	= Executors.newFixedThreadPool(10);
		ExecutorService readingThreadPool	= Executors.newFixedThreadPool(10);

		for(int i=0;i<10;i++) {
			writingThreadPool.submit(new WritingTask(someNumber, writingLock));
			readingThreadPool.submit(new ReadingTask(someNumber, readingLock));
		}

		System.out.println("Main complete...");
	}
}

class WritingTask extends Thread{
	AtomicInteger numberToIncrease;
	Lock writingLock;

	public WritingTask(AtomicInteger numberToIncrease,Lock writingLock) {
		this.numberToIncrease	= numberToIncrease;
		this.writingLock		= writingLock;
	}

	public void run() {
		try {
			writingLock.lock();
			numberToIncrease.addAndGet(1);
			System.out.println("Written value is : "+numberToIncrease.get());
			writingLock.unlock();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class ReadingTask extends Thread{
	AtomicInteger numberToRead;
	Lock readingLock;

	public ReadingTask(AtomicInteger numeberToRead,Lock readingLock) {
		this.numberToRead	= numeberToRead;
		this.readingLock	= readingLock;
	}

	public void run() {
		try {
			readingLock.lock();
			System.out.println("Red value is : "+numberToRead.get());
			Thread.sleep((long) Math.random());
			readingLock.unlock();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
