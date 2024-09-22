package com.sahil.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop class constructor");
    }
    @Override
    public void compile(){
        System.out.println("Code is compiling using Desktop");
    }

}
