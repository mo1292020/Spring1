package com.test.spring1.controller;

import com.test.spring1.entity.TrainingUserEntity;
import com.test.spring1.model.CityModel;
import com.test.spring1.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class ApplicationController {

    @Autowired
    SpringService springService;

    @GetMapping("/name")
    public String getName(){
        return springService.getName();
    }

    @GetMapping("/cities")
    public List<CityModel> getAllCities(){
        return springService.getAllCities();
    }

    @PostMapping("/create/user")
    public ResponseEntity createUser(@RequestBody TrainingUserEntity trainingUserEntity){
        springService.addUser(trainingUserEntity);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/find/user/{name}")
    public Optional<TrainingUserEntity> getUserByName(@PathVariable String name){
        return springService.getUserByName(name);
    }
}
