package com.example.course.services;

import com.example.course.entities.Course;
import com.example.course.services.http.response.StudentByCourseResponse;

import java.util.List;

public interface IcourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course c);

    StudentByCourseResponse findStudentByIdCourse(Long idCourse);
}
