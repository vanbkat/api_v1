package com.example.demo_spring_v1.repository;

import com.example.demo_spring_v1.entites.ProductV1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productv1Repository extends JpaRepository<ProductV1,Long> {
}
