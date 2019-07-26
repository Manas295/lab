package com.queue.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBQDemo {
	public static void main(String[] args) {
		 Buffer buffer = new Buffer();
	        // Starting two threads
	        ExecutorService executor = Executors.newFixedThreadPool(2);
	        executor.execute(new ProdTask(buffer));
	        executor.execute(new ConTask(buffer));
	        executor.shutdown();
	}

}
/**
 * Producer class
 */
class ProdTask implements Runnable{
    Buffer buffer;
    ProdTask(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            buffer.put(i);
        }
    }
}

/**
 * Consumer Class
 */
class ConTask implements Runnable{
    Buffer buffer;
    ConTask(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            buffer.get();;
        }
    }    
}

//Shared class used by threads
class Buffer{
    int i;
    // Bounded LinkedBlockingQueue of size 1
    BlockingQueue<Integer> linkedBlockingQ = new LinkedBlockingQueue<Integer>(1);
    public void get(){
        try {
            // take method to get from blockingqueue
            int i = linkedBlockingQ.take();
            System.out.println("Consumer recd - " + i);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public void put(int i){
        this.i = i;
        try {
            // putting in blocking queue
            linkedBlockingQ.put(i);
            System.out.println("Putting - " + i);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        
    }
}
