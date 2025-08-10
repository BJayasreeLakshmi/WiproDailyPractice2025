package com.wipro.mockitdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class OrderServiceTest {

    @Test
    void orderServiceTest() {
        OrderService mockService = mock(OrderService.class);

        when(mockService.placeOrder("ORD-01")).thenReturn("successful");

        String result = mockService.placeOrder("ORD-01");
        assertEquals("successful", result);

        verify(mockService).placeOrder("ORD-01");
    }
}
