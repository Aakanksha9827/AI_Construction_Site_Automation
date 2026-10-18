package com.example.ConstructionManagementSystem.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConstructionManagementSystem.entity.Manager;
import com.example.ConstructionManagementSystem.model.ManagerModel;
import com.example.ConstructionManagementSystem.model.RegistrationModel;
import com.example.ConstructionManagementSystem.repository.ManagerRepo;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	private ManagerRepo repo;

	@Override
	public void addData(ManagerModel manager) {
		Manager manager2 = new Manager();
			BeanUtils.copyProperties(manager, manager2);
			repo.save(manager2);
	}
}
