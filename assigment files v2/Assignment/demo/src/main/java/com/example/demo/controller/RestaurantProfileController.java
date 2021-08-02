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

}
