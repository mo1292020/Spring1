package com.test.spring1.repo;

import com.test.spring1.entity.TrainingUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainingUserRepo extends JpaRepository<TrainingUserEntity,Integer> {

    Optional<TrainingUserEntity> findAllByName(String name);

}
