package com.example.manytomany;

import com.example.manytomany.Domains.Course;
import com.example.manytomany.Domains.Student;
import com.example.manytomany.Repositorys.CourseRepository;
import com.example.manytomany.Repositorys.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ManyToManyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(StudentRepository studentRepository,
                                         CourseRepository courseRepository) {
        return args -> {

            // create a student
            Student student = new Student("John Doe", 15, "8th");

            // save the student
            studentRepository.save(student);

            // create three courses
            Course course1 = new Course("Machine Learning", "ML", 12, 1500);
            Course course2 = new Course("Database Systems", "DS", 8, 800);
            Course course3 = new Course("Web Basics", "WB", 10, 0);

            // save courses
            courseRepository.saveAll(Arrays.asList(course1, course2, course3));

            // add courses to the student
            student.getCourses().addAll(Arrays.asList(course1, course2, course3));

            // update the student
            studentRepository.save(student);
        };
    }
}
