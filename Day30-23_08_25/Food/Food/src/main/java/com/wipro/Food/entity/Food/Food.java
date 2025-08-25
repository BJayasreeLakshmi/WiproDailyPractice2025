package com.wipro.Food.entity.Food;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "food")
@Data
public class Food {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double price;
    
    private String imageUrl;

}
