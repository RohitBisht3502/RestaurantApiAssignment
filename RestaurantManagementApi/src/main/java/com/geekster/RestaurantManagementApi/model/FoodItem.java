package com.geekster.RestaurantManagementApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long foodId;
    private String foodTitle;
    private String foodDescription;

    private double foodPrice;
    private String dummyImageUrl; // Add dummy image URL here
    private LocalDateTime foodDateTime;
    private Type userType;

}
