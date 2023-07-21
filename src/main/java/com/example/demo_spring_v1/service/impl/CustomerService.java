package com.example.demo_spring_v1.service.impl;

import com.example.demo_spring_v1.dto.CustomerDto;
import com.example.demo_spring_v1.entites.Customer;
import com.example.demo_spring_v1.mapper.CustomerMapper;
import com.example.demo_spring_v1.repository.CustomerRepository;
import com.example.demo_spring_v1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<CustomerDto> getAll() {
        return customerRepository.findAll().stream().map(x->customerMapper.toDto(x)).toList();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void update(CustomerDto customerDto) {

    }

    @Override
    public CustomerDto findById(Long id) {

        return customerMapper.toDto(customerRepository.findById(id).get());
    }
}
