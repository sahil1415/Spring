package com.sahil.config;

import com.sahil.model.Alien;
import com.sahil.model.Computer;
import com.sahil.model.Desktop;
import com.sahil.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean()
    @Bean(name = {"Programmer", "Alien", "Coder"})
//    @Scope("prototype")
    public Alien alien(@Autowired Computer com) {
        Alien obj = new Alien();
        obj.setAge(28);
        obj.setCom(com);
        return obj;
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
}
