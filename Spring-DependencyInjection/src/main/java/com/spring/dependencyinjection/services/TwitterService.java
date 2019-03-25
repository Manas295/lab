package com.spring.dependencyinjection.services;

public class TwitterService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Sent to "+rec+" with message= "+msg+"");
		return true;
	}

}
