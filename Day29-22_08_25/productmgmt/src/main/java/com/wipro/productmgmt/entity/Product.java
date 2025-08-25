package com.wipro.productmgmt.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="product")
public class Product {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column
	    private String name;

	    @Column
	    private String category;

	    @Column
	    private double price;
	    
	    @Column
	    private Integer qty;   
	    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	    @JsonManagedReference   
	    private List<Order> orders;

}
