package com.blockingqueue;

/*
BlockingQueue in Java, as the name suggests is a queue that can block the operations. 
Which means BlockingQueue supports operations that wait for the queue to become non-empty 
when retrieving an element, and wait for space to become available in the queue when storing an element.

If we take the Producer-Consumer problem as example where we have two threads, 
one inserting the elements in the queue and another thread retrieving the elements 
from the queue then using the BlockingQueue can block the operation in the following scenarios-

If Producer thread is trying to insert an element when the queue is already full.
If Consumer thread is trying to retrieve an element when the queue is empty.
For that BlockingQueue interface has two specific methods-

put(E e)- Inserts the specified element into this queue, waiting if necessary for space to become available.
take()- Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
*/

/*
Java BlockingQueue Methods

		Throws exception	Special value	Blocks		Times out
Insert	add(e)				offer(e)		put(e)		offer(e, time, unit)
Remove	remove()			poll()			take()		poll(time, unit)
Examine	element()			peek()			NA			NA

1 Methods in first column throw exception if the operation cannot be executed immediately i.e. these methods won't block.
2 Methods in second column return a special value (either null or false, depending on the operation) 
  if operation cannot be performed immediately.
3 Methods in third column will block the current thread indefinitely until the operation can succeed.
4 Methods in fourth column block for only a given maximum time limit before giving up.

*/

/*
BlockingQueue Superinterfaces
BlockingQueue extends Collection, Queue and Iterable interfaces so it inherits all Collection and Queue methods.

As exp. add(E e), remove(Object o) from the Collection interface which are different from the other two methods 
put() and take() in the way that add() and remove() don't block, they throw exception if the operation cannot be 
executed immediately.

poll() and peek() operations from Queue interface where

poll()- Retrieves and removes the head of this queue, or returns null if this queue is empty.
peek()- Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

*/