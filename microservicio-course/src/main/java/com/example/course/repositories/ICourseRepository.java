package com.example.course.repositories;

import com.example.course.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course,Long> {

}
