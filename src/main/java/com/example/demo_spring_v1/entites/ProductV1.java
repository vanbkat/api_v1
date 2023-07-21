package com.example.demo_spring_v1.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductV1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "productv1_oder",joinColumns = @JoinColumn(name = "product_id"),inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<OrderEntity> orders;

}
