package com.sahil.SpringJDBCFirst.app;

import com.sahil.SpringJDBCFirst.model.Student;
import com.sahil.SpringJDBCFirst.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sahil.SpringJDBCFirst.app", "com.sahil.SpringJDBCFirst.model","com.sahil.SpringJDBCFirst.service","com.sahil.SpringJDBCFirst.repository"})
public class SpringJdbcFirstApplication {

	public static void main(String[] args) {
		// Initialize the Spring application context
		ApplicationContext context = SpringApplication.run(SpringJdbcFirstApplication.class, args);

		// Retrieve the Student bean from the context
		Student s1 = context.getBean(Student.class);

		// Now you can call the setters on the Student bean
//		s1.setId(103);
//		s1.setName("Ansh Kant");
//		s1.setMarks(98);

		StudentService service  = context.getBean(StudentService.class);

//		service.addStudent(s1);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}
}
