package javaBasedConfigurations.implicitly.definingBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MyMain {

  private static AnnotationConfigApplicationContext aContext;

  public static void main(String[] args) {
    aContext = new AnnotationConfigApplicationContext(MyMain.class);
    shape shape   = (Circle) aContext.getBean("circle");
    shape.draw();
  }
}
