package com.test.spring1.repo;

import com.test.spring1.entity.CountryLanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryLanguageRepo extends JpaRepository<CountryLanguageEntity,Integer> {
}
