package com.example.demo_spring_v1.entites;

import com.example.demo_spring_v1.dto.StudentDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String image;

    public Student toEntity(StudentDTO studentDTO){
        return Student.builder().id(studentDTO.getId())
                                .name(studentDTO.getName())
                                .address(studentDTO.getAddress()).image(studentDTO.getImage())
                                .build();
    }
}
