package com.example.course.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentDto {
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;
    private String email;

    @Column(name = "course_id")
    private Long courseId;
}
