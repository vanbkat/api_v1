package com.example.demo_spring_v1.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentDTO {
    private Long id;
    private String name;
    private String address;
    private String image;
    private MultipartFile file;

    public StudentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
