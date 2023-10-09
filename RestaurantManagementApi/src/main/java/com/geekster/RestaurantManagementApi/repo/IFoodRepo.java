package com.geekster.RestaurantManagementApi.repo;

import com.geekster.RestaurantManagementApi.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<FoodItem,Long> {
}
