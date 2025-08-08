package com.wipro.letsgo.service;

import java.util.List;

import com.wipro.letsgo.dto.VehicleMovementDto;

public interface VehicleMovementService {
	
	
	
    List<VehicleMovementDto> getAllMovements();

	

	String moveVehicle(VehicleMovementDto dto);

}
