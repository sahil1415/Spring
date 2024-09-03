
package com.sahil.app;

import com.sahil.config.AppConfig;
import com.sahil.model.Alien;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Initialize the Spring context using the AppConfig class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the 'Programmer' bean of type Alien from the context
        Alien alien = context.getBean("Programmer", Alien.class);

        // Call the code method on the Alien bean
        alien.code();

        // Close the context to release resources
        context.close();
    }
}
