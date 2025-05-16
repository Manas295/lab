package com.atomic;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicIntegerDemo {
	public static void main(String[] args) {

		AtomicInteger atomicInteger = new AtomicInteger(123);


		int expectedValue = 123;
		int newValue      = 234;
		/*
		 *compareAndSet() method  compares the current value of the AtomicInteger instance to an expected value, 
		 *and if the two values are equal, sets a new value for the AtomicInteger instance.
		 */
		atomicInteger.compareAndSet(expectedValue, newValue);
		System.out.println("compareAndSet() Value :  "+atomicInteger.get());

		/*addAndGet() adds a number to the AtomicInteger and returns its value after the addition. The second method, 
		 *getAndAdd() also adds a number to the AtomicInteger but returns the value the AtomicInteger had before the 
		 *value was added 
		 */

		AtomicInteger atomicInteger1 = new AtomicInteger(1);
		System.out.println("addAndGet() Value : "+atomicInteger1.getAndAdd(10));
		System.out.println("getAndAdd() Value : "+atomicInteger1.addAndGet(10));


		/*
		 *The decrementAndGet() subtracts 1 from the AtomicInteger value and returns its value after the subtraction. 
		 *The getAndDecrement() also subtracts 1 from the AtomicInteger value but returns the value the AtomicInteger 
		 *had before the subtraction.
		 */
		AtomicInteger atomicInteger2 = new AtomicInteger(10);
		System.out.println("getAndDecrement() Value : "+atomicInteger2.getAndDecrement());
		System.out.println("decrementAndGet() Value : "+atomicInteger2.decrementAndGet());

		AtomicLong tokens = new AtomicLong(0);
		tokens.set(30);
		System.out.println("VALUE ---> "+tokens.get());

	}

}
