package com.wipro.productmgmt.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productmgmt.entity.Order;
import com.wipro.productmgmt.entity.Product;
import com.wipro.productmgmt.repo.OrderRepo;
import com.wipro.productmgmt.repo.ProductRepo;
import com.wipro.productmgmt.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	OrderRepo orderRepo;

	@Override
	public Order placeOrder(int productId, int qty) {
		Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getQty() < qty) {
            throw new RuntimeException("Not enough stock available");
		
        }

        
        product.setQty(product.getQty() - qty);
        productRepo.save(product);

        
        Order order = new Order();
        order.setProduct(product);
        order.setQtyPurchased(qty);
        order.setOrderDate(LocalDateTime.now());

        return orderRepo.save(order);
    }
		
	

	@Override
	public List<Order> findAll() {
		  return orderRepo.findAll();
	}

}
