package com.example.demo_spring_v1.service.impl;

import com.example.demo_spring_v1.entites.Category;
import com.example.demo_spring_v1.repository.CategoryRepository;
import com.example.demo_spring_v1.service.BaseSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements BaseSevices<Category> {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Page<Category> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public boolean save(Category category) {
        return false;
    }

    @Override
    public boolean update(Category category) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
    public Category finbyid(long id ){
       return categoryRepository.findById(id).get();
    }
}
