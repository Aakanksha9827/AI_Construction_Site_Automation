package com.example.ConstructionManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.Labour;
import com.example.ConstructionManagementSystem.entity.Labour;

@Repository
public interface LabourRepo extends JpaRepository<Labour, Long>{

	Labour getByEmail(String email);
}
