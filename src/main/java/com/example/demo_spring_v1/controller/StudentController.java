package com.example.demo_spring_v1.controller;

import com.example.demo_spring_v1.dto.StudentDTO;
import com.example.demo_spring_v1.entites.Student;
import com.example.demo_spring_v1.service.BaseSevices;
import com.example.demo_spring_v1.service.impl.StudentService1;
import com.example.demo_spring_v1.service.impl.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService1 studentServices ;

    private BaseSevices<StudentDTO> studentDTOBaseSevices = new StudentServices();

    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getAll(){
       List<Student> students = new ArrayList<>();
       return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping("/delete{id}")
    public HttpStatus delete(@RequestParam("id")Long id){
        studentServices.delete(id);
        return HttpStatus.valueOf(200);
    }



}
