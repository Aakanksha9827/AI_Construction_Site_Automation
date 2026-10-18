package com.example.ConstructionManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConstructionManagementSystem.entity.ApartmentBuyers;
import com.example.ConstructionManagementSystem.entity.Engineer;
import com.example.ConstructionManagementSystem.entity.Labour;
import com.example.ConstructionManagementSystem.entity.LandAndHouseBuilder;
import com.example.ConstructionManagementSystem.entity.LandSeller;
import com.example.ConstructionManagementSystem.entity.Manager;
import com.example.ConstructionManagementSystem.entity.OwnLandConstruction;
import com.example.ConstructionManagementSystem.repository.ApartmentBuyersRepo;
import com.example.ConstructionManagementSystem.repository.EngineerRepo;
import com.example.ConstructionManagementSystem.repository.LabourRepo;
import com.example.ConstructionManagementSystem.repository.LandAndHouseBuilderRepo;
import com.example.ConstructionManagementSystem.repository.LandSellerRepo;
import com.example.ConstructionManagementSystem.repository.ManagerRepo;
import com.example.ConstructionManagementSystem.repository.OwnLandConstructionRepo;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private EngineerRepo engineerRepo;
	
	@Autowired
	private LabourRepo labourRepo;
	
	@Autowired
	private ApartmentBuyersRepo apartmentBuyersRepo;
	
	@Autowired
	private LandAndHouseBuilderRepo landAndHouseBuilderRepo;
	
	@Autowired
	private OwnLandConstructionRepo ownLandConstructionRepo;
	
	@Autowired
	private LandSellerRepo landSellerRepo;
	
	@Autowired
	private ManagerRepo managerRepo;
	
	@Override
	public List<Engineer> getAllEngineers() {
	    
		return engineerRepo.findAll();
	}
	@Override
	public List<Labour> getAllLabours() {
	
		return labourRepo.findAll();
	}
	@Override
	public List<ApartmentBuyers> getAllApartmentBuyers() {
		
		return apartmentBuyersRepo.findAll();
	}
	@Override
	public List<LandAndHouseBuilder> getAllLandAndHouseBuilders() {
		return landAndHouseBuilderRepo.findAll();
	}
	@Override
	public List<OwnLandConstruction> getAllOwnLandConstruction() {
		return ownLandConstructionRepo.findAll();
	}
	@Override
	public List<LandSeller> getAllLandSellers() {
		return landSellerRepo.findAll();
	}
	@Override
	public List<Manager> getAllManagers() {
		return managerRepo.findAll();
	}
	
	 @Override
	    public void allocateRecord(Long id, String entityType) {
	        switch (entityType.toLowerCase()) {

	            case "engineer":
	            case "engineers":   // handle both singular/plural
	                engineerRepo.findById(id).ifPresent(e -> {
	                    e.setStatus("Allocated");
	                    engineerRepo.save(e);
	                });
	                break;

	            case "labour":
	            case "labours":
	                labourRepo.findById(id).ifPresent(l -> {
	                    l.setStatus("Allocated");
	                    labourRepo.save(l);
	                });
	                break;

	            case "apartmentbuyers":
	                apartmentBuyersRepo.findById(id).ifPresent(a -> {
	                    a.setStatus("Allocated");
	                    apartmentBuyersRepo.save(a);
	                });
	                break;

	            case "landandhousebuilder":
	            case "landandhousebuilders":
	                landAndHouseBuilderRepo.findById(id).ifPresent(lh -> {
	                    lh.setStatus("Allocated");
	                    landAndHouseBuilderRepo.save(lh);
	                });
	                break;

	            case "ownlandconstruction":
	                ownLandConstructionRepo.findById(id).ifPresent(o -> {
	                    o.setStatus("Allocated");
	                    ownLandConstructionRepo.save(o);
	                });
	                break;

	            case "landseller":
	                landSellerRepo.findById(id).ifPresent(ls -> {
	                    ls.setStatus("Allocated");
	                    landSellerRepo.save(ls);
	                });
	                break;

	            case "manager":
	            case "managers":
	                managerRepo.findById(id).ifPresent(m -> {
	                    m.setStatus("Allocated");
	                    managerRepo.save(m);
	                });
	                break;

	            default:
	                throw new IllegalArgumentException("Unknown entityType: " + entityType);
	        }
	    }

	    @Override
	    public void rejectRecord(Long id, String entityType) {
	        switch (entityType.toLowerCase()) {

	            case "engineer":
	            case "engineers":
	                engineerRepo.deleteById(id);
	                break;

	            case "labour":
	            case "labours":
	                labourRepo.deleteById(id);
	                break;

	            case "apartmentbuyers":
	                apartmentBuyersRepo.deleteById(id);
	                break;

	            case "landandhousebuilder":
	            case "landandhousebuilders":
	                landAndHouseBuilderRepo.deleteById(id);
	                break;

	            case "ownlandconstruction":
	                ownLandConstructionRepo.deleteById(id);
	                break;

	            case "landseller":
	                landSellerRepo.deleteById(id);
	                break;

	            case "manager":
	            case "managers":
	                managerRepo.deleteById(id);
	                break;

	            default:
	                throw new IllegalArgumentException("Unknown entityType: " + entityType);
	        }
	    }
}
