package com.example.student.services;

import com.example.student.entities.Student;
import com.example.student.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {

    }
    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return studentRepository.findAllByStudent(idCourse);
    }
}
