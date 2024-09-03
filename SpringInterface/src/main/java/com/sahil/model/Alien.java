
package com.sahil.model;

public class Alien {
    private int id;
    private Computer com;

    public Alien(){
        System.out.println("Alien Class Constructor");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Alien is Coding");
        com.compile();
    }
}

