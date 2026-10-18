package com.example.ConstructionManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConstructionManagementSystem.entity.Appointment;
import com.example.ConstructionManagementSystem.repository.AppointmentRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
    private AppointmentRepo appointmentRepository;

    @Override
    public void saveAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }
}
