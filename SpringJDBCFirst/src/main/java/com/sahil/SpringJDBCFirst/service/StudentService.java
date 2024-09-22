package com.sahil.SpringJDBCFirst.service;

import com.sahil.SpringJDBCFirst.model.Student;
import com.sahil.SpringJDBCFirst.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// all the processing on the student details will be done here
@Service
public class StudentService {

    StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent(Student s1) {
        repo.save(s1);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
