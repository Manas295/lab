package com.exchanger.example;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
	public static void main(String[] args) {
		Exchanger<String> exchanger =  new Exchanger<>();
		System.out.println("Exchanger has been created");
		Producer prod=new Producer(exchanger);
		Consumer cons=new Consumer(exchanger);

		Thread prodThread=new Thread(prod,"prodThread");
		Thread consThread=new Thread(cons,"consThread");

		prodThread.start();     //start producer thread.
		consThread.start();     //start consumer thread.

	}
}

class Producer implements Runnable{
	Exchanger<String> exchanger;
	String str;
	Producer(Exchanger<String> exchanger){
		str=new String();
		this.exchanger=exchanger;
	}
	@Override
	public void run(){

		for(int i=1;i<=5;i++){
			str+=i;
			System.out.println("Produced : "+i);
			try {
				str= exchanger.exchange(str);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable{
	Producer prod;
	Exchanger<String> exchanger;
	String str;
	Consumer(Exchanger<String> exchanger){
		this.exchanger=exchanger;
	}
	public void run(){
		for(int i=0; i<5;i++){
			try {
				str= exchanger.exchange(new String());
				System.out.println("CONSUMED : " + str  );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}