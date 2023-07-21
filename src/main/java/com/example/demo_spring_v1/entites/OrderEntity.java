package com.example.demo_spring_v1.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "orderEntityList")
    private List<Customer> customerList;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "orders")
    private List<ProductV1> productList;
}
