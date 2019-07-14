package com.thread.synchronization;
public class SynchronizedDemo1 {
	public static void main(String[] args) { 
		Message1 msg1 = new Message1();
		Message1 msg2 = new Message1();
		// Two threads on msg1 object
		MyClass1 mc1 = new MyClass1(msg1);
		MyClass1 mc2 = new MyClass1(msg1);
		// Two threads on msg2 object
		MyClass1 mc3 = new MyClass1(msg2);
		MyClass1 mc4 = new MyClass1(msg2);
	}
}


/*Here it can be seen that thread-0 and thread-1 are invoked on msg1 object where as thread-2 and thread-3 are 
 * invoked on msg-2 object.
 
As we already know if you are using synchronization on the instance methods then the thread will have 
exclusive lock one per instance. In the given example two of the threads share one object and another 
two share another object thus thread-0 and thread-1 will be synchronized using one monitor and thread-2 and 
thread-3 are synchronized using another monitor.

We can see in the output thread-0 and thread-1 are not having any thread interference same way thread 2 and 
thread-3 are not having any thread interference but thread-1 and thread-3 are entering the synchronized 
method at the same time with their own respective locks. Lock hold by thread-1 will stop thread-0 from entering 
the synchronized method as they are working on the same instance. But it cannot stop thread-2 or thread-3 as they are 
working on another instance.
*/