package com.example.ConstructionManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ConstructionManagementSystem.entity.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}
