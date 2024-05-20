package com.example.course.services;

import com.example.course.entities.Course;
import com.example.course.services.http.response.StudentByCourseResponse;

import java.util.List;
import java.util.Optional;

public interface IcourseService {
    List<Course> findAll();
    Optional<Course> findById(Long id);
    void save(Course c);

    StudentByCourseResponse findStudentByIdCourse(Long idCourse);
}
