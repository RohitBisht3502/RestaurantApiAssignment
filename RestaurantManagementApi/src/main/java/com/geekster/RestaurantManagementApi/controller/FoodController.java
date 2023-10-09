package com.geekster.RestaurantManagementApi.controller;

import com.geekster.RestaurantManagementApi.model.FoodItem;
import com.geekster.RestaurantManagementApi.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    FoodService foodService;

    @PostMapping("Food/user{user}")
    public String addFoodItem(@RequestBody FoodItem newFoodItem){
        return foodService.addFoodItem(newFoodItem);
    }
    @GetMapping("Foods")
    public List<FoodItem> getAllFoodItem(){
        return foodService.getAllFoodItem();
    }
    @PutMapping("Food/id/{id}/{user}")
    public String updateFoodItem(@PathVariable Long id,@PathVariable String user,@RequestBody double price){
        return foodService.updateFoodItem(id,user,price);
    }
    @DeleteMapping("Food/id/{id}")
    public String deleteFoodById(@PathVariable Long id){
        return foodService.deleteFoodById(id);
    }
}
