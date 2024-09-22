package com.sahil.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop class constructor");
    }
    @Override
    public void compile(){
        System.out.println("Code is compiling using Laptop");
//        System.out.println("Programmer is dependent on this class");
//        System.out.println("This is basically called dependency injection");
    }
}
