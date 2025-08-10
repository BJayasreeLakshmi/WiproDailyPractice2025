package com.wipro.restdemo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restdemo.entity.DtoMobile;
import com.wipro.restdemo.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	
	@Autowired
	MobileService service;
	
	
	@PostMapping
	public String saveMobile(@RequestBody DtoMobile mobile) {
		
		service.save(mobile);
		System.out.println(mobile);
		return "Mobile data Saved";
		
	}
	
	@GetMapping
	public List<DtoMobile> getAll() {
		return service.getAll();
		
	}
	
	@GetMapping("mobile/{id}")
	public DtoMobile getById(@PathVariable int id){
		
		DtoMobile mobile = service.getById(id);
        if (mobile != null) {
            System.out.println("GET: " + mobile);
            return mobile;
        }
        return null;
		
	}
	
	@PutMapping
    public String updateMobile(@RequestBody DtoMobile mobile) {
        boolean updated = service.update(mobile);
        if (updated) {
            System.out.println("PUT: " + mobile);
            return "Mobile updated";
        } else {
            return "Mobile not found to update";
        }
    }
	
	@DeleteMapping("/{id}")
    public String deleteMobile(@PathVariable int id) {
        boolean deleted = service.delete(id);
        if (deleted) {
            System.out.println("DELETE: id = " + id);
            return "Mobile deleted";
        } else {
            return "Mobile not found";
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PostMapping
//    public String saveMobile(@RequestBody DtoMobile mobile) {
//        System.out.println("POST: " + mobile);
//        return "Mobile saved";
//    }
//	
//	@GetMapping
//    public String getMobile(@RequestParam String modelNumber) {
//        
//        return "mobile with modelNumber: " + modelNumber;
//    }
//	@PutMapping
//    public String updateMobile(@RequestBody DtoMobile mobile) {
//        System.out.println("PUT: " + mobile);
//        return "Mobile updated";
//    }
//	
//	@DeleteMapping
//    public String deleteMobile(@RequestParam String modelNumber) {
//        System.out.println("DELETE: " + modelNumber);
//        return "Mobile deleted";
//    }

}
