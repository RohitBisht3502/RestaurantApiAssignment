package com.geekster.RestaurantManagementApi.service;

import com.geekster.RestaurantManagementApi.model.FoodItem;
import com.geekster.RestaurantManagementApi.model.Type;
import com.geekster.RestaurantManagementApi.repo.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    @Autowired
    IFoodRepo foodRepo;

    public String addFoodItem(FoodItem newFoodItem) {
        Type type=newFoodItem.getUserType();
        String user=type+"";
        if(user.equals("ADMIN")){
            foodRepo.save(newFoodItem);
            return "Food Item added to menu";
        }else return "You are not ADMIN";

    }

    public List<FoodItem> getAllFoodItem() {
        return foodRepo.findAll();
    }

    public String updateFoodItem(Long id,String user,double price) {
        Optional<FoodItem> food=foodRepo.findById(id);
        if(user.equals("ADMIN")){
            if(food.isPresent()){
                FoodItem Food=food.get();
                Food.setFoodPrice(price);
                foodRepo.save(Food);
                return "updated";
            }else return "not a valid id";
        }else {
            return "contact to admin";
        }
    }

    public String deleteFoodById(Long id) {
        Optional<FoodItem> foodItem=foodRepo.findById(id);
        if(foodItem.isPresent()){
            foodRepo.deleteById(id);
            return "deleted";
        }else return "not found";
    }
}
