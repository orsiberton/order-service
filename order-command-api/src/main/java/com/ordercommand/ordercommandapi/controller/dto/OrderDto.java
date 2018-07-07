package com.ordercommand.ordercommandapi.controller.dto;

import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class OrderDto {

    private UUID orderId;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Float price;

}
