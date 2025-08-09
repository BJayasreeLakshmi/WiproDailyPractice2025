package com.wipro.carms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.carms.dto.CarDto;
import com.wipro.carms.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
    private CarService carService;

    @PostMapping
    public CarDto createCar(@RequestBody CarDto dto) {
        return carService.createCar(dto);
    }

    @GetMapping
    public List<CarDto> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public CarDto getCarById(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PutMapping("/{id}")
    public CarDto updateCar(@PathVariable int id, @RequestBody CarDto dto) {
        return carService.updateCar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable int id) {
        carService.deleteCar(id);
    }

}
