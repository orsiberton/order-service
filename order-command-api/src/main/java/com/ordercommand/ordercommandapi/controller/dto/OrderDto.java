package com.ordercommand.ordercommandapi.controller.dto;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class OrderDto {

    private String description;
    private DaypartDto daypart;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Float price;

}
