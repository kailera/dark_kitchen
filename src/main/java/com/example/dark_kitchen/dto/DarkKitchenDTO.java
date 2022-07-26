package com.example.dark_kitchen.dto;

import com.example.dark_kitchen.enums.DarkKitchenType;
import com.example.dark_kitchen.models.Address;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DarkKitchenDTO {
    private long id;

    @NotNull
    @Size(min = 1, max=200)
    private String name;

    @Enumerated(EnumType.STRING)
    @NotNull
    private DarkKitchenType darkKitchenType;

    @NotNull
    @Max(1000)
    private double area;

    @NotNull
    @Max(20000)
    private double price;

    @NotNull
    private Address address;

    @NotNull
    private ArrayList items;
}
