package com.ordercommand.ordercommandapi.service.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
public class Order {

    private UUID orderId;
    private String description;
    private Daypart daypart;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Float price;

}
