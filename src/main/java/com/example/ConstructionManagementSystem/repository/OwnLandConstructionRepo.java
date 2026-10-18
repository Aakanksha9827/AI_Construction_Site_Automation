package com.example.ConstructionManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.OwnLandConstruction;

@Repository
public interface OwnLandConstructionRepo extends JpaRepository<OwnLandConstruction, Long>{

	OwnLandConstruction getByEmail(String email);
}
