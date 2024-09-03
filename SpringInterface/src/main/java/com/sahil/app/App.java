

package com.sahil.app;


import com.sahil.model.Alien;
import com.sahil.model.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        System.out.println( "Inside the app class" );

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Alien alien = (Alien) context.getBean("alien");
        // we needed to type cast here because the getBean() function returns object og Object type
//        no we will use getBean by type
        Alien alien = context.getBean("alien", Alien.class);
        Desktop desktop = (Desktop) context.getBean("desktop");

        System.out.println("Id of alien is - " + alien.getId());
        alien.code();
    }
}
