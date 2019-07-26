/**
 * 
 */
/**
 * @author manas.bansal
 *
 */


package com.queue.linkedblockingqueue;

/* LinkedBlockingQueue in Java internally uses linked nodes to store elements. 
 * It is optionally bounded and that's where it differs from another implementation of BlockingQueue, 
 * ArrayBlockingQueue which is a bounded queue, another difference between the two is 
 * how elements are stored internally ArrayBlockingQueue uses array internally whereas 
 * LinkedBlockingQueue uses linked nodes.
 * 
 * Since LinkedBlockingQueue is optionally bounded so it has both types of constructors:
 * 
 * one where initial capacity can be passed thus making it bounded.
 *
 * OR
 * 
 * without any capacity thus making it unbounded. Note that in case no initial capacity is defined capacity 
 * of LinkedBlockingQueue is Integer.MAX_VALUE.
 * 
 * 
 * LinkedBlockingQueue orders elements in first-in-first-out (FIFO) order. 
 * The head of the queue is that element that has been on the queue the longest time. 
 * The tail of the queue is that element that has been on the queue the shortest time.

	New elements are inserted at the tail of the queue, and the queue retrieval 
	operations obtain elements at the head of the queue.
 * */
