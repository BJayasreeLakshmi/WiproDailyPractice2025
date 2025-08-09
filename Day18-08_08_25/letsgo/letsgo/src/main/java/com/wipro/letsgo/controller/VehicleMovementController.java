package com.wipro.letsgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgo.Repo.VehicleMovementRepo;
import com.wipro.letsgo.dto.VehicleMovementDto;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;

@RestController
@RequestMapping("/vehicle")
public class VehicleMovementController {
	
	
	@Autowired
    private VehicleMovementService movementService;
	
		@PostMapping("/move")
	    public String moveVehicle(@RequestBody VehicleMovementDto dto) {
	        return movementService.moveVehicle(dto);
	    }

	    @GetMapping
	    public List<VehicleMovementDto> getAll() {
	        return movementService.getAllMovements();
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PostMapping
//    public ResponseEntity<String> moveVehicle(@RequestBody VehicleMovementDto dto) {
//        String result = movementService.saveMovement(dto);
//        return ResponseEntity.status(201).body(result);  // 201 Created
//    }
//	
//	 @GetMapping
//	    public ResponseEntity<List<VehicleMovementDto>> getAll() {
//	        List<VehicleMovementDto> all = movementService.getAllMovements();
//	        return ResponseEntity.ok(all); // 200 OK
//	    }
//	

}
