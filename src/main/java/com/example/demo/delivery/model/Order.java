package com.example.demo.delivery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private int number;

    private Customer customer;

    private LocalDate createdAt;

    private List<Item> itemList = new ArrayList<>();

}
