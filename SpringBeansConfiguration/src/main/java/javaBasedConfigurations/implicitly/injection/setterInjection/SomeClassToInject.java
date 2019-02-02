package javaBasedConfigurations.implicitly.injection.setterInjection;

import org.springframework.stereotype.Component;

@Component
public class SomeClassToInject {
    public void display() {
        System.out.println("This is success ..");
    }
}
