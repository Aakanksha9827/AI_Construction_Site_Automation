package com.example.ConstructionManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ConstructionManagementSystem.entity.ApartmentBuyers;
import com.example.ConstructionManagementSystem.entity.Engineer;
import com.example.ConstructionManagementSystem.entity.Labour;
import com.example.ConstructionManagementSystem.entity.LandAndHouseBuilder;
import com.example.ConstructionManagementSystem.entity.LandSeller;
import com.example.ConstructionManagementSystem.entity.Manager;
import com.example.ConstructionManagementSystem.entity.OwnLandConstruction;
import com.example.ConstructionManagementSystem.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService service;
	
	@GetMapping("/admin/panel")
	public String adminPanel() {
	    return "adminPanel";
	}

	
	@GetMapping("/admin/engineers")
	public String viewEngineers(ModelMap modelmap) {
		List<Engineer> engineers = service.getAllEngineers();
		modelmap.addAttribute("all", engineers);
		modelmap.addAttribute("title", "List Of Engineers");
		modelmap.addAttribute("entityType","engineers");
		return "roles/engineerList";
	}
	
	@GetMapping("/admin/labours")
	public String viewLabours(ModelMap modelmap) {
		List<Labour> labours = service.getAllLabours();
		modelmap.addAttribute("all",labours);
		modelmap.addAttribute("title","List Of Labours");
		modelmap.addAttribute("entityType","labours");
		return "roles/labourList";
	}
	
	@GetMapping("/admin/apartmentBuyers")
	public String viewApartmentBuyers(ModelMap modelmap) {
		List<ApartmentBuyers> apartmentBuyers = service.getAllApartmentBuyers();
		modelmap.addAttribute("all",apartmentBuyers);
		modelmap.addAttribute("title","List of Apartment Buyers");
		modelmap.addAttribute("entityType","apartmentBuyers");
		return "roles/apartmentBuyersList";
	}
	
	@GetMapping("/admin/landAndHouseBuilders")
	public String viewLandAndHouseBuilder(ModelMap modelmap) {
		List<LandAndHouseBuilder> landAndHouseBuilders = service.getAllLandAndHouseBuilders();
		modelmap.addAttribute("all",landAndHouseBuilders);
		modelmap.addAttribute("title","List Of customer's wants to buy land and construct building");
		modelmap.addAttribute("entityType","landAndHouseBuilders");
		return "roles/landAndHouseBuilderList";
	}
	
	@GetMapping("/admin/ownLandConstruction")
	public String viewOwnLandConstruction(ModelMap modelmap) {
		List<OwnLandConstruction> ownLandConstruction = service.getAllOwnLandConstruction();
		modelmap.addAttribute("all",ownLandConstruction);
		modelmap.addAttribute("title","List Of customer's wants to construct building on own land");
		modelmap.addAttribute("entityType","ownLandConstruction");
		return "roles/ownLandConstructionList";
	}
	
	@GetMapping("/admin/landSeller")
	public String viewLandSeller(ModelMap modelmap) {
		List<LandSeller> landSellers = service.getAllLandSellers();
		modelmap.addAttribute("all",landSellers);
		modelmap.addAttribute("title","List Of land sellers");
		modelmap.addAttribute("entityType","landSeller");
		return "roles/landSellerList";
	}
	
	@GetMapping("/admin/managers")
	public String viewManagers(ModelMap modelmap) {
		List<Manager> managers = service.getAllManagers();
		modelmap.addAttribute("all",managers);
		modelmap.addAttribute("title","List Of Manager's");
		modelmap.addAttribute("entityType","managers");
		return "roles/managerList";
	}
	@GetMapping("/admin/allocate/{id}/{entityType}")
	public String allocate(@PathVariable Long id, @PathVariable String entityType) {
	    service.allocateRecord(id, entityType);
	    return "redirect:/admin/" + entityType;
	}

	@GetMapping("/admin/reject/{id}/{entityType}")
	public String reject(@PathVariable Long id, @PathVariable String entityType) {
	    service.rejectRecord(id, entityType);
	    return "redirect:/admin/" + entityType;
	}
	
}
