package com.example.demo_spring_v1.service.impl;

import com.example.demo_spring_v1.dto.OrderDto;
import com.example.demo_spring_v1.entites.OrderEntity;
import com.example.demo_spring_v1.mapper.OrderMapper;
import com.example.demo_spring_v1.repository.OrderRepository;
import com.example.demo_spring_v1.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderMapper mapper;

    @Override
    public List<OrderDto> getAll() {
        return orderRepository.findAll().stream().map(x->mapper.toDto(x)).toList();
    }

    @Override
    public void save(OrderEntity orderEntity) {

    }

    @Override
    public void update(OrderDto orderDto) {

    }
}
