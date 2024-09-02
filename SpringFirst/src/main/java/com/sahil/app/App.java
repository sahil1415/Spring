package com.sahil.app;

import com.sahil.model.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // The moment this line is executed, the Spring IOC container is initialized and beans are created.
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieving the Alien bean from the Spring container (singleton scope by default).
        Alien alien1 = (Alien) context.getBean("alien");

        // Retrieving the same Alien bean again (will return the same instance because of singleton scope).
        Alien alien2 = (Alien) context.getBean("alien");

        // Calling the code() method on the alien1 instance.
        System.out.println(alien1.getAge());
        alien1.code();

        // Since alien1 and alien2 are the same instance, changes to one will affect the other.
        // Uncomment below to test:
        // alien1.setAge(25);
//         System.out.println(alien2.getAge()); // Should print 25

        // Using prototype scope would create a new instance each time getBean() is called.
        // Uncomment the prototype scope configuration in beans.xml and observe the difference.
    }
}
