package com.example.demo_spring_v1.api;

import com.example.demo_spring_v1.dto.CustomerDto;
import com.example.demo_spring_v1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerApi {
    @Autowired
    private ICustomerService iCustomerService;
    @GetMapping("/getAllCustomer")
    public ResponseEntity<List<CustomerDto>> getAll(){

        return new ResponseEntity<>( iCustomerService.getAll(), HttpStatus.OK);
    }

}
