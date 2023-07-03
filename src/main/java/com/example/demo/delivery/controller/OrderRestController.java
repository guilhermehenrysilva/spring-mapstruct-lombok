package com.example.demo.delivery.controller;

import com.example.demo.delivery.OrderMapper;
import com.example.demo.delivery.dto.OrderDTO;
import com.example.demo.delivery.fixture.OrderFixture;
import com.example.demo.delivery.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderRestController {
    private final OrderMapper orderMapper;

    @GetMapping("/to-entity")
    public Order dtoToEntity(){
        OrderDTO orderDTO = OrderFixture.orderDTO();
        Order order = orderMapper.toEntity(orderDTO);
        return order;
    }

    @GetMapping("/to-dto")
    public OrderDTO entityToDto(){
        Order order = OrderFixture.order();
        OrderDTO orderDTO = orderMapper.toDTO(order);
        return orderDTO;
    }
}
