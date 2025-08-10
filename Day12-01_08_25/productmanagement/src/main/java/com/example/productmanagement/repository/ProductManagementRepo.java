package com.example.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productmanagement.entity.ProductManagement;

@Repository
public interface ProductManagementRepo  extends JpaRepository<ProductManagement,Integer>{
	List<ProductManagement> findByProductName(String productName);
	
	List<ProductManagement> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);


}
