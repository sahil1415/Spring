package com.sahil.app;

import com.sahil.model.Programmer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sahil.model"}) // Add this to scan the model package
public class App {

    public static void main(String[] args) {
        // Initialize the Spring application context
        ApplicationContext context = SpringApplication.run(App.class, args);

        // Retrieve the Programmer bean from the context
        Programmer p1 = context.getBean(Programmer.class);

        // Call the coding method
        System.out.println("Programmer age is " + p1.getAge());
        p1.coding();
    }
}
