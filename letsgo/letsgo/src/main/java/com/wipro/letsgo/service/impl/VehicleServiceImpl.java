package com.wipro.letsgo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.letsgo.Repo.VehicleMovementRepo;
import com.wipro.letsgo.dto.VehicleMovementDto;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;

@Service
public class VehicleServiceImpl implements VehicleMovementService{
	
	@Autowired
	VehicleMovementRepo vehicleRepo;

	
	@PostMapping("/move")
    public String moveVehicle(@RequestBody VehicleMovementDto dto) {
        VehicleMovement move = new VehicleMovement();
        move.setVehicleId(dto.getVehicleId());
        move.setLatitude(dto.getLatitude());
        move.setLongitude(dto.getLongitude());

        vehicleRepo.save(move);
        return "Data Saved successfully";
    }

	 @Override
	    public List<VehicleMovementDto> getAllMovements() {
	        List<VehicleMovement> entities = vehicleRepo.findAll();
	        List<VehicleMovementDto> dtos = new ArrayList<>();

	        for (VehicleMovement move : entities) {
	            VehicleMovementDto dto = new VehicleMovementDto();
	            dto.setVehicleId(move.getVehicleId());
	            dto.setLatitude(move.getLatitude());
	            dto.setLongitude(move.getLongitude());
	            dtos.add(dto);
	        }

	        return dtos;
	    }
	

	

}
