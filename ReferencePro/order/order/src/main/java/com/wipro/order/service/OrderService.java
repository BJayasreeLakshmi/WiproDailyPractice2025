package com.wipro.order.service;

import java.util.List;

import com.wipro.order.entity.OrderEntity;



public interface OrderService {
	
	 	List<OrderEntity> findAll();
	 	OrderEntity findById(int id);
	    void save(OrderEntity orderEntity);
	    void deleteById(int id);

}
