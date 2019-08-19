package annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   private static ApplicationContext context;

public static void main(String[] args) {
      context = new ClassPathXmlApplicationContext("BeansAnnotationQualifier.xml");

      Profile profile = (Profile) context.getBean("profile");

      profile.printAge();
      profile.printName();
   }
}