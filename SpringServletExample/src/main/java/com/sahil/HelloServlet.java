package com.sahil;



import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

//@WebServlet("/hello")  when we use external tomcat
public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Inside the service method");

        // sending data back to the client
//        res.getWriter().println("Hello this is my first Servlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1><b>Hello World</b></h1>");
    }
}
