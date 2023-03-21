package com.skypro.auction.enums;

public enum Status {
    STARTED("STARTED"), STOPPED("STOPPED"), CREATED("CREATED");

    private final String text;

    Status(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}