package com.example.demo_spring_v1.service.impl;

import com.example.demo_spring_v1.entites.Product;
import com.example.demo_spring_v1.repository.ProductRepository;
import com.example.demo_spring_v1.service.BaseSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements BaseSevices<Product> {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Page<Product> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public boolean save(Product product) {
        productRepository.saveAndFlush(product);
        return true;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
    public List<Product> getList(){
        return productRepository.findAll();
    }
}
