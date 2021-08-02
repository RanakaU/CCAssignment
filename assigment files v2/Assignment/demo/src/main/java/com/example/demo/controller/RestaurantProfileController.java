package com.example.demo.controller;

import com.example.demo.model.RestaurantProfile;
import com.example.demo.service.RestaurantProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RestaurantProfileController {
    

    @Autowired
    RestaurantProfileService restaurantProfileService;


    @PostMapping("/createRprofile")
    public int createprofile(@RequestBody RestaurantProfile restaurantProfile){
        try{
            restaurantProfileService.createprofile(restaurantProfile);
            return 1;
        }
        catch(Exception exception){
            System.out.print(exception);
            return 0;
        }
    }

    @GetMapping("/getRprofile/{email}")
    public RestaurantProfile getRestaurantProfile(@PathVariable(name = "email")String email){
        return restaurantProfileService.getRestaurantProfile(email);
    }

    @GetMapping("/getAll")
    public List<RestaurantProfile> getAll(){
        return restaurantProfileService.getAll();
    }

    @GetMapping("/get/{name}")
    public RestaurantProfile getRestaurant(@PathVariable String name){
        return restaurantProfileService.getProfile(name);
    }

    @GetMapping("/get/cuisine/{cuisine}")
    public List<RestaurantProfile> getRestaurantsByCuisine(@PathVariable String cuisine){
        return restaurantProfileService.getAllByCuisine(cuisine);
    }

    @GetMapping("/get/type/{type}")
    public List<RestaurantProfile> getRestaurantsByType(@PathVariable String type){
        return restaurantProfileService.getAllByType(type);
    }
}