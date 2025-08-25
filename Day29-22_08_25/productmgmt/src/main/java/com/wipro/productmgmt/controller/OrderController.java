package com.wipro.productmgmt.controller;

import com.wipro.productmgmt.entity.Order;
import com.wipro.productmgmt.entity.Product;
import com.wipro.productmgmt.repo.OrderRepo;
import com.wipro.productmgmt.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

    @Autowired
    private ProductRepo productRepository;

    @Autowired
    private OrderRepo orderRepository;

    // DTO for receiving JSON
    public static class OrderRequest {
        private int productId;
        private int qtyPurchased;

        public int getProductId() { return productId; }
        public void setProductId(int productId) { this.productId = productId; }

        public int getQtyPurchased() { return qtyPurchased; }
        public void setQtyPurchased(int qtyPurchased) { this.qtyPurchased = qtyPurchased; }
    }

    @PostMapping
    public ResponseEntity<?> placeOrder(@RequestBody OrderRequest orderRequest) {
        int productId = orderRequest.getProductId();
        int qtyPurchased = orderRequest.getQtyPurchased();

        Product product = productRepository.findById(productId).orElse(null);
        if (product == null) {
            return ResponseEntity.badRequest().body("Product not found");
        }

        if (qtyPurchased <= 0) {
            return ResponseEntity.badRequest().body("Quantity must be greater than 0");
        }

        if (qtyPurchased > product.getQty()) {
            return ResponseEntity.badRequest().body("Not enough stock available");
        }

        // Reduce stock
        product.setQty(product.getQty() - qtyPurchased);
        productRepository.save(product);

        // Create order
        Order order = new Order();
        order.setProduct(product);
        order.setQtyPurchased(qtyPurchased);
        order.setOrderDate(LocalDateTime.now());

        orderRepository.save(order);

        return ResponseEntity.ok(order);
    }

    @GetMapping
    public Iterable<Order> getAllOrders() {
        return orderRepository.findAll().stream()
                .peek(o -> o.getProduct().getName()) 
                .collect(Collectors.toList());
    }
}
