/**
 * 
 */
/**
 * @author manas.bansal
 *
 */


package com.queue.arrayblockingqueue;

/*
 * ArrayBlockingQueue in Java is a bounded blocking queue which internally uses an array to store elements. 
 * ArrayBlockingQueue orders elements in FIFO (first-in-first-out) order. 
 * When new elements are inserted, those are inserted at the tail of the queue. 
 * At the time of retrieval, elements are retrieved from the head of the queue.
 * 
 * 
 * Since ArrayBlockingQueue is bounded it means you can't add unlimited number of elements in it. 
 * ArrayBlockingQueue has to be created with some initial capacity and that capacity cannot be changed later. 
 * Attempts to put an element into a full queue will result in the operation blocking; 
 * attempts to take an element from an empty queue will similarly block.
 */
