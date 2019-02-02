package javaBasedConfigurations.implicitly.injection.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    private static ApplicationContext applicationContext;

    public static void main(String args []) {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        SomeDemoClass someDemoClass = applicationContext.getBean(SomeDemoClass.class);
        someDemoClass.someClassToInject.display();
    }
}
