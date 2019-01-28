package com.java.dependencyinjection.injector;

import com.java.dependencyinjection.consumer.Consumer;
import com.java.dependencyinjection.consumer.MyDIApplication;
import com.java.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}
