package com.wipro.carms.service;

import java.util.List;

import com.wipro.carms.dto.CarDto;

public interface CarService {

	CarDto createCar(CarDto dto);

	List<CarDto> getAllCars();

	CarDto getCarById(int id);

	CarDto updateCar(int id, CarDto dto);

	void deleteCar(int id);

}
