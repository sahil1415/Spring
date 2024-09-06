package com.sahil.config;

import com.sahil.model.Alien;
import com.sahil.model.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    // Define a bean of type Alien with the name 'Programmer'
//    @Bean()
    @Bean(name = {"Programmer", "Alien", "Coder"})
//    @Scope("prototype")                            // to set he scope type i.e, singelton or prototype
    public Alien alien(Laptop laptop) {
        Alien obj = new Alien();
        obj.setAge(28);
        obj.setLap(laptop);
        return obj;
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
}
