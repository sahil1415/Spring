package com.sahil.config;

import com.sahil.model.Alien;
import com.sahil.model.Computer;
import com.sahil.model.Desktop;
import com.sahil.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.sahil")
public class AppConfig {

////    @Bean()
//    @Bean(name = {"Programmer", "Alien", "Coder"})
////    @Scope("prototype")
//    public Alien alien(@Autowired @Qualifier("desktop") Computer com) {
//        Alien obj = new Alien();   // when we have multiple beans
//        obj.setAge(28);            // either we can use qualifier or primary
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
//    @Bean
////    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }
}
