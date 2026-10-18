package com.example.ConstructionManagementSystem.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConstructionManagementSystem.entity.ApartmentBuyers;
import com.example.ConstructionManagementSystem.entity.Engineer;
import com.example.ConstructionManagementSystem.entity.Labour;
import com.example.ConstructionManagementSystem.entity.LandAndHouseBuilder;
import com.example.ConstructionManagementSystem.entity.LandSeller;
import com.example.ConstructionManagementSystem.entity.Manager;
import com.example.ConstructionManagementSystem.entity.OwnLandConstruction;
import com.example.ConstructionManagementSystem.model.ApartmentBuyersModel;
import com.example.ConstructionManagementSystem.model.EngineerModel;
import com.example.ConstructionManagementSystem.model.LabourModel;
import com.example.ConstructionManagementSystem.model.LandAndHouseBuilderModel;
import com.example.ConstructionManagementSystem.model.LandSellerModel;
import com.example.ConstructionManagementSystem.model.ManagerModel;
import com.example.ConstructionManagementSystem.model.OwnLandConstructionModel;
import com.example.ConstructionManagementSystem.model.RegistrationModel;
import com.example.ConstructionManagementSystem.repository.ApartmentBuyersRepo;
import com.example.ConstructionManagementSystem.repository.EngineerRepo;
import com.example.ConstructionManagementSystem.repository.LabourRepo;
import com.example.ConstructionManagementSystem.repository.LandAndHouseBuilderRepo;
import com.example.ConstructionManagementSystem.repository.LandSellerRepo;
import com.example.ConstructionManagementSystem.repository.ManagerRepo;
import com.example.ConstructionManagementSystem.repository.OwnLandConstructionRepo;

@Service
public class FormServiceImpl implements FormService{

	@Autowired
	private ManagerRepo repo;
	
	@Autowired
	private EngineerRepo repo2;
	
	@Autowired
	private LabourRepo repo3;
	
	@Autowired
	private LandSellerRepo repo4;
	
	@Autowired
	private OwnLandConstructionRepo repo5;
	
	@Autowired
	private LandAndHouseBuilderRepo repo6;
	
	@Autowired
	private ApartmentBuyersRepo repo7;
	
	

	@Override
	public void addData(ManagerModel manager) {
		    Manager manager2 = new Manager();
			BeanUtils.copyProperties(manager, manager2);
			repo.save(manager2);
			
	}

	@Override
	public void addDataEngineer(EngineerModel engineer) {
		Engineer engineer2 = new Engineer();
		BeanUtils.copyProperties(engineer, engineer2);
		repo2.save(engineer2);
	}

	@Override
	public void addDataLabour(LabourModel labour) {
		Labour labour2 = new Labour();
		BeanUtils.copyProperties(labour, labour2);
		repo3.save(labour2);
	}

	@Override
	public void addDataLandSeller(LandSellerModel landSeller) {

		LandSeller landSeller2 = new LandSeller();
		BeanUtils.copyProperties(landSeller, landSeller2);
		repo4.save(landSeller2);
	}

	@Override
	public void addDataOwnLandConstruction(OwnLandConstructionModel ownLandConstruction) {
		OwnLandConstruction ownLandConstruction2 = new OwnLandConstruction();
		BeanUtils.copyProperties(ownLandConstruction, ownLandConstruction2);
		repo5.save(ownLandConstruction2);
	}

	@Override
	public void addDataLandAndHouseBuilder(LandAndHouseBuilderModel landAndHouseBuilder) {
		LandAndHouseBuilder landAndHouseBuilder2 = new LandAndHouseBuilder();
		BeanUtils.copyProperties(landAndHouseBuilder , landAndHouseBuilder2);
		repo6.save(landAndHouseBuilder2);
	}

	@Override
	public void addDataApartmentBuyers(ApartmentBuyersModel apartmentBuyers) {
		ApartmentBuyers apartmentBuyers2 = new ApartmentBuyers();
		BeanUtils.copyProperties(apartmentBuyers, apartmentBuyers2);
		repo7.save(apartmentBuyers2);
	}
}
