package com.example.demo_spring_v1.repository;

import com.example.demo_spring_v1.dto.StudentDTO;
import com.example.demo_spring_v1.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("select new com.example.demo_spring_v1.dto.StudentDTO(id,name) from Student")
    public List<StudentDTO>getAll();

    //query method name
    List<Student> findByName(String name);



}
