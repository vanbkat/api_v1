package com.example.demo_spring_v1.service;


import com.example.demo_spring_v1.dto.CustomerDto;
import com.example.demo_spring_v1.entites.Customer;

public interface ICustomerService extends CommonService<CustomerDto, Customer> {
    CustomerDto findById(Long id);
}
