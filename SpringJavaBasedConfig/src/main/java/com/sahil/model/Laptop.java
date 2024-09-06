package com.sahil.model;


public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop class constructor");
    }

    @Override
    public void compile(){
        System.out.println("Code is compiling in Laptop");
    }
}
