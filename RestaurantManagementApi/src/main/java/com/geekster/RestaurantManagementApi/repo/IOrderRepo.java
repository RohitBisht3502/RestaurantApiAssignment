package com.geekster.RestaurantManagementApi.repo;

import com.geekster.RestaurantManagementApi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
}
