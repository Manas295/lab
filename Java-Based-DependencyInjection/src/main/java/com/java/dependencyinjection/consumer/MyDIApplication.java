/*
 * Notice that our application class is just using the service. 
 * It does not initialize the service that leads to better “separation of concerns“. 
 * Also use of service interface allows us to easily test the application by mocking the 
 * MessageService and bind the services at runtime rather than compile time.
 *
 */

package com.java.dependencyinjection.consumer;

import com.java.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer {

	private MessageService messageService;

	public MyDIApplication(MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMessages(String msg, String rec) {
		this.messageService.sendMessage(msg, rec);

	}

}
