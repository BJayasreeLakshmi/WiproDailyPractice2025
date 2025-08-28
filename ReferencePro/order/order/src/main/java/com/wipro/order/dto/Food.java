package com.wipro.order.dto;

import lombok.Data;

@Data
public class Food {
    private int id;
    private String name;
    private String category;
    private double price;
    private String imageUrl; 
}