package com.sahil.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope("prototype")
public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop class constructor");
    }

    @Override
    public void compile(){
        System.out.println("Code is compiling in Laptop");
    }
}
