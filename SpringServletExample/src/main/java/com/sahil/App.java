package com.sahil;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import static org.apache.catalina.startup.Tomcat.addServlet;


public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);

        Context context = tomcat.addContext("", null);
        addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();

    }
}
