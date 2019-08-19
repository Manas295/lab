package annotation.jsr;

import javax.annotation.*;

public class HelloWorld {
	
   @Resource(name ="message")
	private String message1;

   //@Resource(name ="message") // just like autowire by name
   public void setMessage(String message){
      this.message1  = message;
   }

   public String getMessage(){
      System.out.println("Your Message : " + message1);
      return message1;
   }
   
   @PostConstruct
   public void init(){
      System.out.println("Bean is going through init.");
   }
   
   @PreDestroy
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
}