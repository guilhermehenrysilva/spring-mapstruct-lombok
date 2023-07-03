package com.example.demo.delivery.fixture;

import com.example.demo.delivery.dto.CustomerDTO;
import com.example.demo.delivery.model.Customer;

public class CustomerFixture {

    public static Customer customer () {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("Guilherme");
        customer.setLastName("Silva");
        customer.setLogin("guihenry96");
        customer.setPassword("wiuhsfai@uof#$jw");

        return customer;
    }

    public static CustomerDTO customerDTO () {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(1L);

        return customerDTO;
    }

}
