package com.sahil.app;


import com.sahil.config.AppConfig;
import com.sahil.model.Alien;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static <ApplicationContext> void main(String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Alien.class);

        Alien alien = context.getBean(Alien.class);
        alien.code();
    }
}
