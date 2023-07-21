package com.example.demo_spring_v1.mapper;

import com.example.demo_spring_v1.dto.OrderDto;
import com.example.demo_spring_v1.entites.OrderEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public OrderDto toDto(OrderEntity orderEntity){
        return OrderDto.builder().id(orderEntity.getId()).code(orderEntity.getCode()).build();
    }
}
