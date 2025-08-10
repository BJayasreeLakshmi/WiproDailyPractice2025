package com.wipro.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="user")
public class User {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		
		@Column(name="user_name")
		String username;
		
		@Column(name="user_password")
		String password;
		
		@Column(name="user_address")
		String address;

}
