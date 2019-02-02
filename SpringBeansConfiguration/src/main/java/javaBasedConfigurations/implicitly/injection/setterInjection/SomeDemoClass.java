package javaBasedConfigurations.implicitly.injection.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
