package javaBasedConfigurations.explicitly.injection.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeDemoClass {
    
  
    SomeClassToInject someClassToInject;
    
    public SomeDemoClass() {
    }
    
    /*
     * This is setter injection
     */
    @Autowired
    public void setSomeClassToInject(SomeClassToInject someClassToInject) {
        this.someClassToInject = someClassToInject;
    }
}
