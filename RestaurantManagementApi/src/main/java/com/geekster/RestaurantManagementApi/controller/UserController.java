package com.geekster.RestaurantManagementApi.controller;

import com.geekster.RestaurantManagementApi.model.User;
import com.geekster.RestaurantManagementApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("User")
    public String addUser(@RequestBody User newUser){
       return userService.addUser(newUser);
    }

    @GetMapping("User")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PutMapping("User/id/{id}")
    public String updateUserById(@PathVariable Long id,@RequestBody String name){
        return userService.updateUserById(id,name);
    }
    @DeleteMapping("User/id/{id}")
    public String deleteUserById(@PathVariable Long id){
        return userService.deleteUserById(id);
    }
}
