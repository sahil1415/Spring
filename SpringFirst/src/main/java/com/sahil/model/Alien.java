package com.sahil.model;

public class Alien {

    private int age;
    private Laptop lap;

    // Default constructor: called when the Alien bean is created.
    public Alien() {
        System.out.println("Alien Object Created");
    }

    // Getter and setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter accessed: setting age to " + age);
        this.age = age;
    }

    // Setter for Laptop (used for setter injection)
    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    // Method that simulates coding, utilizing the Laptop dependency
    public void code() {
        System.out.println("Alien is coding...");
        lap.compile(); // Delegates the compile task to the Laptop instance
    }
}
