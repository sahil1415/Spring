package com.sahil.config;

import com.sahil.model.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define a bean of type Alien with the name 'Programmer'
    @Bean(name = {"Programmer", "Alien", "Coder"})
    public Alien alien() {
        return new Alien();
    }
}
