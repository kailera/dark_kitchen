package com.example.dark_kitchen.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DarkKitchenType {
    SMALL("small"),
    MEDIUM("medium"),
    WIDE("wide"),
    INDUSTRIAL("industrial");
    private final String type;
}
