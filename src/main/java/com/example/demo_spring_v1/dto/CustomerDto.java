package com.example.demo_spring_v1.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private long id;
    private String name;
    private String address;
    private List<OrderDto> orderDtoList;

}
