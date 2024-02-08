package com.test.spring1.service;

import com.test.spring1.entity.TrainingUserEntity;
import com.test.spring1.mapper.CityMapper;
import com.test.spring1.model.CityModel;
import com.test.spring1.repo.CityRepo;
import com.test.spring1.repo.TrainingUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SpringService {

    @Autowired
    CityRepo cityRepo;

    @Autowired
    TrainingUserRepo trainingUserRepo;

    @Autowired
    CityMapper cityMapper;

    public String getName(){
        return "Mohamed";
    }

    public List<CityModel> getAllCities(){
        return cityRepo.findAll().
                stream().map(cityEntity -> cityMapper.toModel(cityEntity))
                .collect(Collectors.toList());
    }

    public void addUser(TrainingUserEntity trainingUserEntity){
        trainingUserRepo.save(trainingUserEntity);
    }

    public Optional<TrainingUserEntity> getUserByName(String name){
        return trainingUserRepo.findAllByName(name);
    }

}
