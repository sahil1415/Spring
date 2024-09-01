package com.sahil.SpringFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Autowired // creating hte connection between laptop and programmer
    Laptop lap;

    public void info(){


        System.out.println("So if you want spring to create and manage " +
                "object of your class you need to use @Component");

        System.out.println("Accessing the compile function of laptop");
        lap.compile();

    }
}

