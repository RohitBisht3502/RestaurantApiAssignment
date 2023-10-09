package com.geekster.RestaurantManagementApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OrderTable")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @ManyToOne
    @JoinColumn(name = "fk_foodItem")
    private FoodItem foodItemId;
    private Integer orderQuantity;
    private Status orderStatus;
    @ManyToOne
    @JoinColumn(name = "fk_userId")
    private User userId;
    private LocalDateTime orderDateTime;
}
