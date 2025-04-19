package com.example.studentapp.service;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.studentapp.exception.StudentNotFoundException;

import java.util.List;
@Service

public class StudentService {

    @Autowired

    private StudentRepo repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    public Student updateStudent(Student student) {
        return repo.save(student);
    }
}
