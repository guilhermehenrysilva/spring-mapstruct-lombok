package com.example.demo.delivery.dto;

import com.example.demo.delivery.model.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Long id;

    private int number;

    private CustomerDTO customerDTO;

    private String createdAt;

    private String createdBy;

    private List<Item> itemList = new ArrayList<>();

    private Long total;

}
