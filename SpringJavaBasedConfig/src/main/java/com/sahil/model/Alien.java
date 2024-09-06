package com.sahil.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private String name;

    @Value("29")
    private int age;

    @Autowired
    @Qualifier("laptop")      // qualifier is preferred over primary
    private Computer com;

    // Default constructor with a print statement for debugging
    public Alien() {
        System.out.println("Alien class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    // Method that simulates the Alien coding
    public void code() {
        System.out.println("Alien is coding");
        com.compile();

    }
}
