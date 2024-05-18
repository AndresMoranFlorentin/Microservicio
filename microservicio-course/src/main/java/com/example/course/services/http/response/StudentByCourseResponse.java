package com.example.course.services.http.response;

import com.example.course.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentByCourseResponse {
    private String nameCourse;
    private String teacher;
    private List<StudentDto> studianteDtoList;

}
