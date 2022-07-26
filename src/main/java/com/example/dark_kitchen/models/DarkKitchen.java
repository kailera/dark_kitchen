package com.example.dark_kitchen.models;

/**
 * class of atributes of dark kitchen
 * @author kailera
 */

import com.example.dark_kitchen.enums.DarkKitchenType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DarkKitchen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DarkKitchenType darkKitchenType;

    @Column(nullable = false)
    private double area;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Address address;

    @Column(nullable = false)
    private ArrayList items;

}
