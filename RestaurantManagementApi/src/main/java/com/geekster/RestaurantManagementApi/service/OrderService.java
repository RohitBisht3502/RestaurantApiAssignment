package com.geekster.RestaurantManagementApi.service;

import com.geekster.RestaurantManagementApi.model.Order;
import com.geekster.RestaurantManagementApi.model.Type;
import com.geekster.RestaurantManagementApi.model.User;
import com.geekster.RestaurantManagementApi.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public String addOrder(Order order) {
        User user=order.getUserId();
        Type userType=user.getUserType();
        String str=userType+"";
        if(str.equals("ADMIN")){
            return "order placed";
        }else return "not admin";

    }

    public List<Order> getAllOrder() {
       return orderRepo.findAll();
    }

    public String deleteOrderById(Long id) {
        orderRepo.deleteById(id);
        return "order deleted";
    }
}
