package annotation.autowire.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   private static ApplicationContext context;

public static void main(String[] args) {
      context = new ClassPathXmlApplicationContext("BeansAutowireRequired.xml");

      Student student = (Student) context.getBean("student");

      System.out.println("Name : " + student.getName());
      System.out.println("Age : " + student.getAge());
   }
}