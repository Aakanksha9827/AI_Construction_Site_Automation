package com.example.ConstructionManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.LandAndHouseBuilder;

@Repository
public interface LandAndHouseBuilderRepo extends JpaRepository<LandAndHouseBuilder, Long>{

	LandAndHouseBuilder getByEmail(String email);
}
