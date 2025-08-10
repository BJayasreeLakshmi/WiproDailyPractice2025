package com.example.productmanagement.controller;

import java.util.List;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

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

import com.example.productmanagement.entity.ProductManagement;
import com.example.productmanagement.repository.ProductManagementRepo;
import com.example.productmanagement.service.ProductManagementService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "ProductManagement", description = "Product Management APIs")
@RestController
@RequestMapping("/productmanagement")
public class ProductManagementController {
	
	@Autowired
	ProductManagementService productManagementService;
	
	
	@Operation(summary = "Save a tourist place")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })
	@PostMapping
	void save(@RequestBody ProductManagement productManagement) {
		
		productManagementService.save(productManagement);
		
	}
	
	
	@GetMapping
	List<ProductManagement> findAll(){
		return productManagementService.findAll();
	}
	
	@GetMapping("/{id}")
	ProductManagement findById(@PathVariable int id) {
		return productManagementService.findById(id);
		
	}
	
	@PutMapping
	void update(@RequestBody ProductManagement productManagement)
	{
		productManagementService.save(productManagement);
		
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		productManagementService.deleteById(id);
		
	}
	
	
	@GetMapping("/type")
	List<ProductManagement> findByProductName(@RequestParam String ProductName)
	{
		return productManagementService.findByProductName(ProductName);
		
	}
	@GetMapping("/typepath/{path}")
	List<ProductManagement> findByProductNamePath(@PathVariable String path)
	{
		return productManagementService.findByProductName(path);
		
	}
	@GetMapping("/search/{productName}/{productMake}")
    public List<ProductManagement> searchByProductNameAndMake(
            @RequestParam String productName,
            @RequestParam String productMake) {
        return productManagementService.getProductsByNameAndMakeSortedDesc(productName, productMake);
    }
	

}
