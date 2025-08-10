package com.wipro.carms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="car_registration_details")
public class CarRegistrationDetails {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "registration_id")
	    private int id;

	    @Column(name = "registration_number")
	    private String registrationNumber;

	    @Column(name = "registration_date")
	    private String dateOfRegistration;

}
