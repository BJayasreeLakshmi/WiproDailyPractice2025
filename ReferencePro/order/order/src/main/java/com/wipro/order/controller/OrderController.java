package com.wipro.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.order.entity.OrderEntity;
import com.wipro.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderEntity> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public OrderEntity findById(@PathVariable int id) {
        return orderService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody OrderEntity order) {
        orderService.save(order);
    }

    @PutMapping
    public void update(@RequestBody OrderEntity order) {
        orderService.save(order);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        orderService.deleteById(id);
    }
}

