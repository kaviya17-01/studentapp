package com.example.studentapp.service;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class StudentServiceTest {

    @Mock
    private StudentRepo repo;

    @InjectMocks
    private StudentService service;

    @Test
    void testAddStudent() {
        Student student = new Student(null, "John", 21, "CS");
        when(repo.save(student)).thenReturn(student);

        Student saved = service.addStudent(student);
        assertEquals("John", saved.getName());
    }

    @Test
    void testGetStudentById() {
        Student student = new Student(1L, "Alice", 22, "Math");
        when(repo.findById(1L)).thenReturn(Optional.of(student));

        Student found = service.getStudentById(1L);
        assertEquals("Alice", found.getName());
    }

    @Test
    void testGetAllStudents() {
        when(repo.findAll()).thenReturn(Arrays.asList(
                new Student(1L, "A", 20, "CS"),
                new Student(2L, "B", 21, "Math")
        ));

        assertEquals(2, service.getAllStudents().size());
    }
}
