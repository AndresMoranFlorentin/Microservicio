package com.example.course.services;

import com.example.course.client.StudentClient;
import com.example.course.dto.StudentDto;
import com.example.course.entities.Course;
import com.example.course.repositories.ICourseRepository;
import com.example.course.services.http.response.StudentByCourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements IcourseService{
    @Autowired
    private ICourseRepository repoCourse;
    @Autowired
    private StudentClient studentClient;
    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(Long id) {
        return null;
    }

    @Override
    public void save(Course c) {

    }

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long idCourse) {
        //consultar el curso
        Course course = repoCourse.findById(idCourse).orElse(new Course());
        //obtener los estudiantes
        List<StudentDto> studentDtolist=studentClient.findAllStudentByCourse(idCourse);
        return StudentByCourseResponse.builder()
                .nameCourse(course.getName())
                .teacher(course.getTeacher())
                .studianteDtoList(studentDtolist)
                .build();
    }
}
