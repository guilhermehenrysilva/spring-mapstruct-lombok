package com.example.demo.delivery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Long id;

    private String description;

    private Long price;

    private int quantity;

    private Long totalPrice;

    public void checkTotal () {
        this.totalPrice = this.quantity * this.price;
    }

}
