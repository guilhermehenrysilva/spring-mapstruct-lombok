package com.example.demo.delivery.fixture;

import com.example.demo.delivery.dto.OrderDTO;
import com.example.demo.delivery.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrderFixture {

    public static Order order () {
        Order order = new Order();
        order.setId(1L);
        order.setNumber(1);
        order.setCustomer(CustomerFixture.customer());
        order.setCreatedAt(LocalDate.of(2023, 4, 24));
        order.setItemList(ItemFixture.itemList());

        return order;
    }

    public static OrderDTO orderDTO () {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(1L);
        orderDTO.setNumber(1);
        orderDTO.setCustomerDTO(CustomerFixture.customerDTO());
        orderDTO.setCreatedAt("2023-04-24");
        orderDTO.setItemList(new ArrayList<>());

        return orderDTO;
    }
}
