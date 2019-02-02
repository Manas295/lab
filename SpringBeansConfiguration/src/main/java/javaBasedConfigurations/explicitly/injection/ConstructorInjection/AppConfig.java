package javaBasedConfigurations.explicitly.injection.ConstructorInjection;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SomeDemoClass someDemoClass() {
        return new SomeDemoClass(hashMap(),arrayList(),"Piyush",26);
    }
    
    @Bean
    public HashMap<String,String> hashMap(){
        return new HashMap<String,String>();
    }
    
    @Bean
    public ArrayList<String> arrayList(){
        return new ArrayList<String>();
    }
}
