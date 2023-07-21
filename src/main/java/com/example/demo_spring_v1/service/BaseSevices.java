package com.example.demo_spring_v1.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseSevices <T>{
    Page<T> getAll(Pageable pageable);
    boolean save(T t);

    boolean update(T t);

    boolean delete(Long id);


}
