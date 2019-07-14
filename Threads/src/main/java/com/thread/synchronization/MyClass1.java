package com.thread.synchronization;
class MyClass1 implements Runnable{
	Thread t; 
	Message1 msg; 
	MyClass1(Message1 msg){
		this.msg = msg; 
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
	//	msg.displayMsg();
		msg.staticdisplayMsg();
	}
}
