package com.thread.synchronization;
class Message1{
	public synchronized void displayMsg(){
		System.out.println("In run method " + Thread.currentThread().getName()); 
		for(int i = 0; i < 5 ; i++){
			System.out.println(Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}

	//Code with static synchronized method

	public static synchronized void staticdisplayMsg(){
		System.out.println("In run method " + Thread.currentThread().getName()); 
		for(int i = 0; i < 5 ; i++){
			System.out.println(Thread.currentThread().getName() + " i - " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}

}
