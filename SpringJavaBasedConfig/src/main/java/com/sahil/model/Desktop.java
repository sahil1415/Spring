package com.sahil.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop class constructor");
    }
    @Override
    public void compile(){
        System.out.println("Code is compiling in Desktop");
    }
}
