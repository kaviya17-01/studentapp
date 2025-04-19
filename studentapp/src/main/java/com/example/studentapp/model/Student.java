package com.example.studentapp.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String course;

    public Student() {
    }

    public Student(Long id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {  
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


/*Lombok helps you avoid writing boring boilerplate code
 like getters, setters, constructors, toString(), etc.
 open pom.xml and add this inside <dependencies>:
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version> <!-- or the latest version -->
    <scope>provided</scope>
</dependency>
Right-click pom.xml → Maven → Reload Project

import jakarta.persistence.*;
import lombok.Data;  // 🌟 Lombok annotation
@Entity
@Data  // 🌟 This one generates all getters, setters, toString, equals, hashCode
public class Student {....

 */



