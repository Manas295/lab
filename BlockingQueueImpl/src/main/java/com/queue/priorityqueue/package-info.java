/**
 * 
 */
/**
 * @author manas.bansal
 *
 */


package com.queue.priorityqueue;

/*
 * PriorityBlockingQueue class in Java is an implementation of BlockingQueue interface. 
 * PriorityBlockingQueue class uses the same ordering rules as the PriorityQueue class, in fact 
 * PriorityBlockingQueue can be termed as the thread-safe alternative of the PriorityQueue 
 * as it has blocking retrieval operations.
 * 
 * While PriorityBlockingQueue is logically unbounded, attempted additions may fail due 
 * to resource exhaustion (causing OutOfMemoryError). That's where it differs from the other 
 * implementations of BlockingQueue like ArrayBlockingQueue (Always bounded) and 
 * LinkedBlockingQueue (both bounded and unbounded options).
 * 
 * As Example put(E e) method in ArrayBlockingQueue or LinkedBlockingQueue will wait 
 * if necessary for space to become available
 * 
 * Whereas put(E e) method in PriorityBlockingQueue will never block as it is unbounded.
 * The elements of the PriorityBlockingQueue are ordered according to their natural ordering, 
 * or by a Comparator provided at queue construction time, depending on which constructor is used.
 * 
 * PriorityBlockingQueue()- Creates a PriorityBlockingQueue with the default initial capacity (11) 
 * that orders its elements according to their natural ordering.
 * 
 * PriorityBlockingQueue(Collection<? extends E> c)- Creates a PriorityBlockingQueue containing the 
 * elements in the specified collection.
 * 
 * PriorityBlockingQueue(int initialCapacity)- Creates a PriorityBlockingQueue with the specified initial 
 * capacity that orders its elements according to their natural ordering.
 * 
 * PriorityBlockingQueue(int initialCapacity, Comparator<? super E> comparator)- Creates a 
 * PriorityBlockingQueue with the specified initial capacity that orders its elements 
 * according to the specified comparator.
 */
