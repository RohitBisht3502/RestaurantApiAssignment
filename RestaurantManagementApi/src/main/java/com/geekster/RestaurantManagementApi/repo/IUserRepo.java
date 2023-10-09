package com.geekster.RestaurantManagementApi.repo;

import com.geekster.RestaurantManagementApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
}
