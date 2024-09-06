package com.sahil.model;

public class Alien {
    private String name;
    private int age;
    private Laptop lap;

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

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    // Method that simulates the Alien coding
    public void code() {
        System.out.println("Alien is coding");
        lap.compile();

    }
}
