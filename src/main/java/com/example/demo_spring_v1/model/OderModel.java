package com.example.demo_spring_v1.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OderModel {
    private long id_user;
    private List<Long> id_product;
}
