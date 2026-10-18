package com.example.ConstructionManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.LandSeller;

@Repository
public interface LandSellerRepo extends JpaRepository<LandSeller, Long>{
	LandSeller getByEmail(String email);
}
