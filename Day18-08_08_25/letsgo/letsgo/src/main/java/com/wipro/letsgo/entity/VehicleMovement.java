package com.wipro.letsgo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="vehicle_movement")
public class VehicleMovement {
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;

	 	@Column(name="vehicle_id")
	    int vehicleId;
	 	
	 	
	    double latitude;

	    
	    double longitude;

}
