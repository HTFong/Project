package com.example.manytomany.Repositorys;

import com.example.manytomany.Domains.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {

    List<Course> findByTitleContaining(String title);

    List<Course> findByFeeLessThan(double fee);
}