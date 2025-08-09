package com.wipro.carms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.carms.carRepo.CarRepo;
import com.wipro.carms.dto.CarDto;
import com.wipro.carms.entity.Car;
import com.wipro.carms.entity.CarRegistrationDetails;
import com.wipro.carms.service.CarService;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	CarRepo carRepo;
	
	 @Override
	    public CarDto createCar(CarDto dto) {
	        Car car = new Car();
	        car.setMake(dto.getMake());

	        CarRegistrationDetails reg = new CarRegistrationDetails();
	        reg.setRegistrationNumber(dto.getRegistrationNumber());
	        reg.setDateOfRegistration(dto.getDateOfRegistration());

	        car.setRegistrationDetails(reg);
	        car = carRepo.save(car);

	        return convertToDTO(car);
	    }
	 
	 @Override
	 public List<CarDto> getAllCars() {
	     List<Car> cars = carRepo.findAll();
	     List<CarDto> carDTOs = new ArrayList<>();

	     for (Car car : cars) {
	         CarDto dto = convertToDTO(car);
	         carDTOs.add(dto);
	     }

	     return carDTOs;
	 }
	 
	 @Override
	    public CarDto getCarById(int id) {
	        return convertToDTO(carRepo.findById(id).orElseThrow());
	    }
	 
	 @Override
	    public CarDto updateCar(int id, CarDto dto) {
	        Car car = carRepo.findById(id).orElseThrow();
	        car.setMake(dto.getMake());
	        car.getRegistrationDetails().setRegistrationNumber(dto.getRegistrationNumber());
	        car.getRegistrationDetails().setDateOfRegistration(dto.getDateOfRegistration());

	        return convertToDTO(carRepo.save(car));
	    }
	 
	 @Override
	    public void deleteCar(int id) {
	        carRepo.deleteById(id);
	    }
	 
	 private CarDto convertToDTO(Car car) {
	        CarDto dto = new CarDto();
	        dto.setId(car.getId());
	        dto.setMake(car.getMake());
	        dto.setRegistrationNumber(car.getRegistrationDetails().getRegistrationNumber());
	        dto.setDateOfRegistration(car.getRegistrationDetails().getDateOfRegistration());
	        return dto;
	    }

}
