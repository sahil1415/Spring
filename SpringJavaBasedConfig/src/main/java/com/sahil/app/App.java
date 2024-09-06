
package com.sahil.app;

import com.sahil.config.AppConfig;
import com.sahil.model.Alien;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Initialize the Spring context using the AppConfig class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the 'Programmer' bean of type Alien from the context
        Alien alien1 = context.getBean("Programmer", Alien.class);
//        Alien alien2 = context.getBean("Coder", Alien.class);
        // Call the code method on the Alien bean

//        alien2.code();
        alien1.setAge(21);
        System.out.println(alien1.getAge());
        alien1.code();
        // Close the context to release resources
        context.close();
    }
}
