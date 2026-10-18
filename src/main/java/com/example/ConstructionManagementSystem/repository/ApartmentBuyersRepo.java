package com.example.ConstructionManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.ApartmentBuyers;

@Repository
public interface ApartmentBuyersRepo extends JpaRepository<ApartmentBuyers, Long>{

	ApartmentBuyers getByEmail(String email);
}
