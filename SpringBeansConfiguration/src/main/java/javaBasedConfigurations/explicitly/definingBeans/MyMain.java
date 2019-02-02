package javaBasedConfigurations.explicitly.definingBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {

  private static AnnotationConfigApplicationContext aContext;

  public static void main(String[] args) {
    aContext = new AnnotationConfigApplicationContext(AppConfig.class);
    shape shape   = (Circle) aContext.getBean("circle");
    shape.draw();
  }
}