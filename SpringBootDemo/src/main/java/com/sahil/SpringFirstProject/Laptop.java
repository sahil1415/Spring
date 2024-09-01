package com.sahil.SpringFirstProject;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile(){
        System.out.println("Programmer is dependent on this class");
        System.out.println("This is basically called dependency injection");
    }
}
