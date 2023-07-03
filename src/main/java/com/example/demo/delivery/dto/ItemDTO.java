package com.example.demo.delivery.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private Long id;

    private String description;

    private Long price;

    private int quantity;

    private Long totalPrice;

}
