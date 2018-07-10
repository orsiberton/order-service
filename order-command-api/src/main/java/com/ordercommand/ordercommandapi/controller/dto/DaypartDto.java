package com.ordercommand.ordercommandapi.controller.dto;

import lombok.Getter;

@Getter
public enum DaypartDto {
    AMD("AMD"), PMD("PMD"), OVERNIGHT("Overnight"), EVENING("Evening"), MIDDAY("Midday");

    private String name;

    DaypartDto(String daypart) {
        this.name = daypart;
    }
}
