package com.geekster.RestaurantManagementApi.service;

import com.geekster.RestaurantManagementApi.model.User;
import com.geekster.RestaurantManagementApi.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String addUser(User newUser) {
        userRepo.save(newUser);
        return "added";
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public String updateUserById(Long id,String name) {
          User user=userRepo.findById(id).get();
          user.setUserName(name);
          userRepo.save(user);
        return "updated";
    }

    public String deleteUserById(Long id) {
        userRepo.deleteById(id);
        return "deleted";
    }
}
