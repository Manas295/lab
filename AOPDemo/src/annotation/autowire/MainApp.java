package annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author piyush.nautiyal
 *
 */

public class MainApp {
   private static ApplicationContext context;

public static void main(String[] args) {	
      context = new ClassPathXmlApplicationContext("BeansAutowireAnnotation.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}