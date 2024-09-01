package com.sahil.SpringFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstProjectApplication {

	public static void main(String[] args) {
		// Initialize the Spring application context
		ApplicationContext context = SpringApplication.run(SpringFirstProjectApplication.class, args);

		// Retrieve the Programmer bean from the context
		Programmer p1 = context.getBean(Programmer.class);

		// Invoke the info method on the Programmer bean
		p1.info();
	}
}

