package annotation.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("BeansAnnotationValue.xml");
		
		Student student	= ctx.getBean("student",Student.class);
		student.printData();
	}

}
