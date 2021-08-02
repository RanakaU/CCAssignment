package com.example.demo.service;

import com.example.demo.model.RestaurantProfile;
import com.example.demo.repo.RestaurantProfileRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<RestaurantProfile> getAll() {
        return restaurantProfileRepo.findAll();
    }

    public RestaurantProfile getProfile(String name) {
        return restaurantProfileRepo.findByName(name);
    }

    public List<RestaurantProfile> getAllByCuisine(String cuisine) {
        try{
            return restaurantProfileRepo.findAllByCuisine(cuisine);
        }

        catch(Exception exception){
            System.out.println(exception);
            return null;
        }
    }

    public List<RestaurantProfile> getAllByType(String type) {
        try{
            return restaurantProfileRepo.findAllByType(type);
        }

        catch(Exception exception){
            System.out.println(exception);
            return null;
        }
    }

    public void test(RestaurantProfile restaurantProfile){

        RestaurantProfile currentProfile = restaurantProfileRepo.findByEmail(restaurantProfile.getEmail());

        currentProfile.setCuisine(restaurantProfile.getCuisine());

        restaurantProfileRepo.save(currentProfile);
    }
}
