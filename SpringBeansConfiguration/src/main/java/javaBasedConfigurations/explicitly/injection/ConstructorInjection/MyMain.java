package javaBasedConfigurations.explicitly.injection.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    public static void main(String args []) {
        ApplicationContext applicationContext   = new AnnotationConfigApplicationContext(AppConfig.class);
        
        SomeDemoClass someDemoClass = applicationContext.getBean(SomeDemoClass.class);
        System.out.println(someDemoClass);
    }
}
