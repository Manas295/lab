package com.design.patterns.behavioral.ObserverPattern;

public class MyMain {
	public static void main(String[] args) throws InterruptedException {
		YoutubeChannel youtubeChannel	= new YoutubeChannel();


		//Some Subscribers
		Subscriber subscriber1	= new Subscriber();
		Subscriber subscriber2	= new Subscriber();
		Subscriber subscriber3	= new Subscriber();
		Subscriber subscriber4	= new Subscriber();
		
		//Subscribing to channel update
		youtubeChannel.addObserver(subscriber1);
		youtubeChannel.addObserver(subscriber2);
		youtubeChannel.addObserver(subscriber3);
		youtubeChannel.addObserver(subscriber4);
		
		
		System.out.println("Waiting for new updates... total Subscribers are "+youtubeChannel.countObservers());
		
		Thread.sleep(2000);
		
		youtubeChannel.setUpdateVideo("A new video updated");
		
		System.out.println("A new Video is updated.");
		
		Thread.sleep(1000);
		
		youtubeChannel.notifyObservers();
	}
}
