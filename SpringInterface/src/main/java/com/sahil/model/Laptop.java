package com.sahil.model;

public class Laptop implements Computer{

    public Laptop(){
        System.out.println("Laptop class Constructor");
    }

    @Override
    public void compile(){
        System.out.println("Code is Compiling in Laptop");
    }
}