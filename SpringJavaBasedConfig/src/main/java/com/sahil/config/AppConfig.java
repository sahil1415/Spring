package com.sahil.config;

import com.sahil.model.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(){
        return new Alien();
    }
}
