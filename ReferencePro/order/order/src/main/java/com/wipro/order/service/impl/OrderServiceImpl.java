package com.wipro.order.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.order.entity.OrderEntity;
import com.wipro.order.repo.OrderRepo;
import com.wipro.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
    private OrderRepo orderRepo;
	
	@Override
    public List<OrderEntity> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public OrderEntity findById(int id) {
        Optional<OrderEntity> optOrder = orderRepo.findById(id);
        return optOrder.orElse(null);
    }

    @Override
    public void save(OrderEntity order) {
        orderRepo.save(order);
    }

    @Override
    public void deleteById(int id) {
        orderRepo.deleteById(id);
    }

    

}
