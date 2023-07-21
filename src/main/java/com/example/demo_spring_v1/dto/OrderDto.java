package com.example.demo_spring_v1.dto;

import com.example.demo_spring_v1.entites.Customer;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private long id;
    private String code;
    private List<CustomerDto> customerList;
    private List<ProductV1Dto> productV1DtoList;
}
