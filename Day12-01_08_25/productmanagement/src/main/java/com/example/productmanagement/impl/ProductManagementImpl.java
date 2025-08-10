package com.example.productmanagement.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.productmanagement.entity.ProductManagement;
import com.example.productmanagement.repository.ProductManagementRepo;
import com.example.productmanagement.service.ProductManagementService;

@Service
public class ProductManagementImpl implements ProductManagementService{

	@Autowired
	ProductManagementRepo  productManagementRepo;
	
	
	@Override
	public void save(ProductManagement productManagement) {
		
		productManagementRepo.save(productManagement);
	}

	@Override
	public List<ProductManagement> findAll() {
		return productManagementRepo.findAll();
	}

	@Override
	public ProductManagement findById(int id) {
		Optional<ProductManagement> touristPlace=productManagementRepo.findById(id);
		if(!touristPlace.isEmpty())
		{
			return touristPlace.get();
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		productManagementRepo.deleteById(id);
		
	}

	@Override
	public List<ProductManagement> findByProductName(String productName) {
		// TODO Auto-generated method stub
		return productManagementRepo.findByProductName(productName);
	}

	@Override
	public List<ProductManagement> getProductsByNameAndMakeSortedDesc(String productName, String productMake) {
		
		return productManagementRepo.findByProductNameAndProductMakeOrderByProductNameDesc(productName, productMake);

	}
	
	@Override
	public Page<ProductManagement> findAll(Pageable p) {
		// TODO Auto-generated method stub
		return productManagementRepo.findAll(p);
	}

	

}
