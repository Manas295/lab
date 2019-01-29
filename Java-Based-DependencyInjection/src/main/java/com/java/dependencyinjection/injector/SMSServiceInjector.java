package com.java.dependencyinjection.injector;

import com.java.dependencyinjection.consumer.Consumer;
import com.java.dependencyinjection.consumer.MyDIApplication;
import com.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
