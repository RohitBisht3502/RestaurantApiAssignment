package com.geekster.RestaurantManagementApi.controller;

import com.geekster.RestaurantManagementApi.model.Order;
import com.geekster.RestaurantManagementApi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("Order")
    public String addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("Order")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }
    @DeleteMapping("Order/id/{id}")
    public String deleteOrderById(@PathVariable Long id){
        return orderService.deleteOrderById(id);
    }
}
