package com.example.ConstructionManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.Engineer;

@Repository
public interface EngineerRepo extends JpaRepository<Engineer, Long>{
	Engineer getByEmail(String email);
}
