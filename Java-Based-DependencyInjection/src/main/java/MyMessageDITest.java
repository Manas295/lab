import com.java.dependencyinjection.consumer.Consumer;
import com.java.dependencyinjection.injector.EmailServiceInjector;
import com.java.dependencyinjection.injector.MessageServiceInjector;
import com.java.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String message = "Hi Manas";
		String email = "manasbansal295@gmail.com";
		String phone = "9899786753";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(message, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(message, phone);
	}

}
