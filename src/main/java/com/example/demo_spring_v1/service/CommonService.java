package com.example.demo_spring_v1.service;

import java.util.List;

public interface CommonService<T,K> {
    List<T> getAll();
    void save(K k);
    void update(T t);

}
