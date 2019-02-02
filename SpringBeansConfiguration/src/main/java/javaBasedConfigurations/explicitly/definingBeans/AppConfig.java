package javaBasedConfigurations.explicitly.definingBeans;
/*
 * Annotating a class with the @Configuration indicates that the class 
 * can be used by the Spring IoC container as a source of bean definitions. 
 * The @Bean annotation tells Spring that a method annotated with @Bean 
 * will return an object that should be registered as a bean in the Spring application context. 
 * 
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean("circle")
  public Circle circle() {
    return new Circle();
  }
  
  @Bean("square")
  public Square square() {
    return new Square();
  }
}
