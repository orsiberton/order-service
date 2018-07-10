package com.ordercommand.ordercommandapi.service.model;

import lombok.Getter;

@Getter
public enum Daypart {
    AMD("AMD"), PMD("PMD"), OVERNIGHT("Overnight"), EVENING("Evening"), MIDDA("Midday");

    private String name;

    Daypart(String daypart) {
        this.name = daypart;
    }

}
