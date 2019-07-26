package com.queue.priorityqueue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQDemo {
	public static void main(String[] args) {
		String[] cityNames = {"Delhi", "Mumbai", "Chennai", "Bangalore", 
				"Hyderabad", "Lucknow"};
		// initializing PriortiyBlockingQueue
		// BlockingQueue<String> priortyBQ = new PriorityBlockingQueue<String>();
		BlockingQueue<String> priortyBQ = new PriorityBlockingQueue<String>(10, new CityComparator());

		// Producer thread
		new Thread(){
			@Override
			public void run() {
				for(int i = 0; i < cityNames.length; i++){
					try {
						priortyBQ.put(cityNames[i]);
					} catch (InterruptedException e) {
						System.out.println("Error while putting values in the Queue "
								+ e.getMessage());
					}
				}
			}
		}.start();

		// Consumer thread
		new Thread(){
			@Override
			public void run() {
				for(int i = 0; i < cityNames.length; i++){
					try {
						System.out.println(" Consumer got - " + priortyBQ.take());
					} catch (InterruptedException e) {
						System.out.println("Error while retrieving value from the Queue " 
								+ e.getMessage());
					}
				}
			}
		}.start();
	}
}


//Comparator class
class CityComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}    
}
