package com.example.demo_spring_v1.service.impl;

import com.example.demo_spring_v1.dto.ProductV1Dto;
import com.example.demo_spring_v1.entites.ProductV1;
import com.example.demo_spring_v1.repository.Productv1Repository;
import com.example.demo_spring_v1.service.IProductV1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductV1Service implements IProductV1Service {
    @Autowired
    private Productv1Repository productv1Repository;
    @Override
    public List<ProductV1Dto> getAll() {
        return null;
    }

    @Override
    public void save(ProductV1 productV1) {
        productv1Repository.save(productV1);
    }

    @Override
    public void update(ProductV1Dto productV1Dto) {

    }
}
