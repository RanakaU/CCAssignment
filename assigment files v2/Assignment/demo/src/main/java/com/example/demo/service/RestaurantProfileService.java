package com.example.demo.service;

import com.example.demo.model.RestaurantProfile;
import com.example.demo.repo.RestaurantProfileRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantProfileService {
    

    @Autowired
    RestaurantProfileRepo restaurantProfileRepo;


    public void createprofile(RestaurantProfile restaurantProfile){
        restaurantProfileRepo.save(restaurantProfile);
    }



    public RestaurantProfile getRestaurantProfile(String email){

        RestaurantProfile restaurantProfile = restaurantProfileRepo.findByEmail(email);
        return restaurantProfile;
    }




}
