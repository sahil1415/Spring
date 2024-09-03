package com.sahil.model;

public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop class Constructor");
    }
    @Override
    public void compile(){
        System.out.println("Code is compiling in Desktop");
    }
}