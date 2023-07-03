package com.example.demo.delivery;

import com.example.demo.delivery.dto.CustomerDTO;
import com.example.demo.delivery.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    @Mapping(target="lastName", source="sobrenome")
    Customer toEntity(CustomerDTO customerDTO);

    @Mapping(target="sobrenome", source="lastName")
    CustomerDTO toDTO(Customer customer);

}
