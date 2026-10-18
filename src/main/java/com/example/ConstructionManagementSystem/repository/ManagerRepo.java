package com.example.ConstructionManagementSystem.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.Manager;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Long>{
      Manager getByEmail(String email);
}
