package com.example.demo_spring_v1.service.impl;

import com.example.demo_spring_v1.entites.Student;
import com.example.demo_spring_v1.repository.StudentRepository;
import com.example.demo_spring_v1.service.BaseSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService1 implements BaseSevices<Student> {
    @Autowired
    private StudentRepository studentRepository;
//    @Override
//    public List<Student> getAll() {
//
//        return (List<Student>) studentRepository.findAll();
//    }

    @Override
    public Page<Student> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public boolean save(Student student) {


        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
       Student student = studentRepository.findById(id).get();
       studentRepository.delete(student);
        return true;
    }
}
