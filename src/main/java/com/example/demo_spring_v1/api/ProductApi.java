package com.example.demo_spring_v1.api;

import com.example.demo_spring_v1.entites.ProductV1;
import com.example.demo_spring_v1.service.IProductV1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductApi {
    @Autowired
    private IProductV1Service iProductV1Service;
    @PostMapping("/saveProduct")
    public HttpStatus save(@RequestBody ProductV1 productV1){
        iProductV1Service.save(productV1);
        return HttpStatus.valueOf(200);
    }
}



