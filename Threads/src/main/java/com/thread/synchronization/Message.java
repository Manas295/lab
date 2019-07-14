package com.thread.synchronization;
class Message{
	public  void displayMsg(String msg){
		System.out.println("Inside displayMsg method " + Thread.currentThread().getName());

		synchronized(this) {
			System.out.println("**" + msg); 
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("*");
		}
	}
}