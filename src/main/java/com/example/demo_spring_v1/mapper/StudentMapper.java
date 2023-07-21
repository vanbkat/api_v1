package com.example.demo_spring_v1.mapper;

import com.example.demo_spring_v1.dto.StudentDTO;
import com.example.demo_spring_v1.entites.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentDTO toDto(Student student){
        return StudentDTO.builder()
                                    .id(student.getId())
                                    .name(student.getName())
                                    .address(student.getAddress())
                                    .image(student.getImage())
                                    .build();
    }

}
