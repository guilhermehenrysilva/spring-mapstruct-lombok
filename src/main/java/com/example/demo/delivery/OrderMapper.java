package com.example.demo.delivery;

import com.example.demo.delivery.dto.OrderDTO;
import com.example.demo.delivery.model.Item;
import com.example.demo.delivery.model.Order;
import org.mapstruct.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = CustomerMapper.class)
public interface OrderMapper {

    @Mapping( target= "customer", source= "orderDTO.customerDTO")
    @Mapping(target = "createdAt", source = "createdAt", dateFormat = "yyyy-MM-dd")
    Order toEntity(OrderDTO orderDTO);

    @Mapping(target= "customerDTO", source= "order.customer")
    @Mapping(target= "createdBy", source= "order.customer.name")
    @Mapping(target = "createdAt", source = "createdAt", dateFormat = "yyyy-MM-dd")
    @Mapping(target = "total", source = "order.itemList", qualifiedByName = "checkTotalOrder")
    OrderDTO toDTO(Order order);

    @IterableMapping(dateFormat = "yyyy-MM-dd")
    List<LocalDate> dateListToStringList(List<String> dates);

    @IterableMapping(dateFormat = "yyyy-MM-dd")
    List<String> stringListToDateList(List<Date> dates);

    @Named("checkTotalOrder")
    default Long checkTotalOrder(List<Item> itemList) {
       return itemList.stream().mapToLong(item -> item.getTotalPrice()).sum();
    }

}
