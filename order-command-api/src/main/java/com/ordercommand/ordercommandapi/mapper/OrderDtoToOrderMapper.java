package com.ordercommand.ordercommandapi.mapper;

import com.ordercommand.ordercommandapi.controller.dto.OrderDto;
import com.ordercommand.ordercommandapi.service.model.Daypart;
import com.ordercommand.ordercommandapi.service.model.Order;

import java.util.UUID;

public class OrderDtoToOrderMapper {

    private OrderDtoToOrderMapper() {
        // Do nothing
    }

    public static Order map(UUID orderId, OrderDto orderDto) {
        Order order = map(orderDto);
        order.setOrderId(orderId);
        return order;
    }

    public static Order map(OrderDto orderDto) {
        return Order.builder()
                .description(orderDto.getDescription())
                .daypart(orderDto.getDaypart() != null ? Daypart.valueOf(orderDto.getDaypart().getName()) : null)
                .startTime(orderDto.getStartTime())
                .endTime(orderDto.getEndTime())
                .price(orderDto.getPrice())
                .build();
    }

}
