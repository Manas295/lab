package javaBasedConfigurations.explicitly.injection.setterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public SomeClassToInject someClassToInject() {
        return new SomeClassToInject();
    }
    
    @Bean
    public SomeDemoClass someDemoClass() {
        return new SomeDemoClass();
    }
}
