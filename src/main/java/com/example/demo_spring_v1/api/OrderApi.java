package com.example.demo_spring_v1.api;

import com.example.demo_spring_v1.dto.CustomerDto;
import com.example.demo_spring_v1.dto.OrderDto;
import com.example.demo_spring_v1.dto.ProductV1Dto;
import com.example.demo_spring_v1.model.OderModel;
import com.example.demo_spring_v1.service.ICustomerService;
import com.example.demo_spring_v1.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderApi {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private ICustomerService iCustomerService;
    @GetMapping("/getAllOrder")
    public ResponseEntity<List<OrderDto>> getAll(){
        return new ResponseEntity<>(iOrderService.getAll(), HttpStatusCode.valueOf(200));
    }
    @PostMapping("/getOder")
    public void getOrder(@RequestBody OderModel model){
        List<CustomerDto> customerDtos = new ArrayList<>();
        customerDtos.add(iCustomerService.findById(model.getId_user()));
        List<ProductV1Dto> productV1DtoList = new ArrayList<>();
//        for (Long id : model.getId_product()
//             ) {
//            // findbyid của product
//
//            // add vào list product
//            productV1DtoList.
//        }
//            OrderDto orderDto = new OrderDto();
//            orderDto.setCode("abc");
//            orderDto.setProductV1DtoList(productV1DtoList);
//            orderDto.setCustomerList(customerDtos);
//        iOrderService.save();



    }
}
