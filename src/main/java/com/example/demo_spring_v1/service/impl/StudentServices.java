package com.example.demo_spring_v1.service.impl;

import com.example.demo_spring_v1.dto.StudentDTO;
import com.example.demo_spring_v1.entites.Student;
import com.example.demo_spring_v1.mapper.StudentMapper;
import com.example.demo_spring_v1.repository.StudentRepository;
import com.example.demo_spring_v1.service.BaseSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices implements BaseSevices<StudentDTO> {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper mapper;

    @Override
    public Page<StudentDTO> getAll(Pageable pageable) {
        return studentRepository.findAll(pageable).map(x -> mapper.toDto(x));
    }

    @Override
    public boolean save(StudentDTO studentDTO) {
        try {
            studentRepository.save(new Student().toEntity(studentDTO));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean update(StudentDTO studentDTO) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    public List<StudentDTO> findByName(String name){
        return studentRepository.findByName(name).stream().map(x->mapper.toDto(x)).toList();
    }
}
