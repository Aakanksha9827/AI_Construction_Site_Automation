package com.example.ConstructionManagementSystem.service;

import java.util.List;

import com.example.ConstructionManagementSystem.entity.ApartmentBuyers;
import com.example.ConstructionManagementSystem.entity.Engineer;
import com.example.ConstructionManagementSystem.entity.Labour;
import com.example.ConstructionManagementSystem.entity.LandAndHouseBuilder;
import com.example.ConstructionManagementSystem.entity.LandSeller;
import com.example.ConstructionManagementSystem.entity.Manager;
import com.example.ConstructionManagementSystem.entity.OwnLandConstruction;

public interface AdminService {

	List<Engineer> getAllEngineers();

	List<Labour> getAllLabours();

	List<ApartmentBuyers> getAllApartmentBuyers();

	List<LandAndHouseBuilder> getAllLandAndHouseBuilders();

	List<OwnLandConstruction> getAllOwnLandConstruction();

	List<LandSeller> getAllLandSellers();

	List<Manager> getAllManagers();

	void allocateRecord(Long id, String entityType);
    void rejectRecord(Long id, String entityType);
}
