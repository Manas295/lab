import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dependencyinjection.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		/*
		 * ClassPathXmlApplicationContext is used to get the ApplicationContext object by providing the configuration files location. 
		 * It has multiple overloaded constructors and we can provide multiple config files also.
		 * 
		 * 
		 */
		
		
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Pankaj", "pankaj@abc.com");

		// close the context
		context.close();
	
	}

}
