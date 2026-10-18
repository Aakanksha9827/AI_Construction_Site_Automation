package com.example.ConstructionManagementSystem.service;

import com.example.ConstructionManagementSystem.entity.OwnLandConstruction;
import com.example.ConstructionManagementSystem.model.ApartmentBuyersModel;
import com.example.ConstructionManagementSystem.model.EngineerModel;
import com.example.ConstructionManagementSystem.model.LabourModel;
import com.example.ConstructionManagementSystem.model.LandAndHouseBuilderModel;
import com.example.ConstructionManagementSystem.model.LandSellerModel;
import com.example.ConstructionManagementSystem.model.ManagerModel;
import com.example.ConstructionManagementSystem.model.OwnLandConstructionModel;

public interface FormService {

	void addData(ManagerModel manager);

	void addDataEngineer(EngineerModel engineer);

	void addDataLabour(LabourModel labour);

	void addDataLandSeller(LandSellerModel landSeller);

	void addDataOwnLandConstruction(OwnLandConstructionModel ownLandConstruction);

	void addDataLandAndHouseBuilder(LandAndHouseBuilderModel landAndHouseBuilder);

	void addDataApartmentBuyers(ApartmentBuyersModel apartmentBuyers);

}
