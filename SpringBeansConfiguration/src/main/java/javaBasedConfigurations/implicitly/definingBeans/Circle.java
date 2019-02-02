package javaBasedConfigurations.implicitly.definingBeans;

import org.springframework.stereotype.Component;

@Component
public class Circle implements shape{

  public Circle() {
    
  }
  public void draw() {
    System.out.println("I am drawing a cirlce");
  }
}
