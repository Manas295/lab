package javaBasedConfigurations.implicitly.injection.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeDemoClass {
    
    SomeClassToInject someClassToInject;
    
    
    /**
     * 
     * We are using @Autowire for constructor injection implicitly.
     * But , in spring 4.3 version and version greater than 4.3, it is not necessary
     * to use @Autowire annotation.
     * 
     *  So, if we will remove @Autowire annotation, it will still work.
     */
    
    @Autowired
    public SomeDemoClass(SomeClassToInject someClassToInject) {
        this.someClassToInject  = someClassToInject;
    }
}
