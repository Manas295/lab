package pointcut;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test{  
    private static ApplicationContext context;

	public static void main(String[] args){  
        context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = context.getBean("opBean",Operation.class);  
        System.out.println("calling msg...");  
        e.msg();  
        System.out.println("calling m...");  
        e.display();  
        System.out.println("calling k...");  
        e.something();  
    }  
}  