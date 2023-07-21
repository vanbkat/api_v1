package com.example.demo_spring_v1.mapper;

import com.example.demo_spring_v1.dto.CustomerDto;
import com.example.demo_spring_v1.entites.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    @Autowired
    private OrderMapper mapper;
    public CustomerDto toDto(Customer customer){

        return CustomerDto.builder().id(customer.getId()).name(customer.getName()).address(customer.getAddress()).
                orderDtoList(customer.getOrderEntityList().stream().map(x->mapper.toDto(x)).toList()).build();
    }

}
