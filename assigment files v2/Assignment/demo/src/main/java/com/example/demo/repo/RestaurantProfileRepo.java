package com.example.demo.repo;

import com.example.demo.model.RestaurantProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantProfileRepo extends JpaRepository<RestaurantProfile, Long> {
    
    RestaurantProfile findByEmail(String email);
}
