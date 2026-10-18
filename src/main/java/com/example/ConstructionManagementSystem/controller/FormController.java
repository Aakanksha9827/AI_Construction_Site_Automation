package com.example.ConstructionManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ConstructionManagementSystem.entity.ApartmentBuyers;
import com.example.ConstructionManagementSystem.entity.OwnLandConstruction;
import com.example.ConstructionManagementSystem.model.ApartmentBuyersModel;
import com.example.ConstructionManagementSystem.model.EngineerModel;
import com.example.ConstructionManagementSystem.model.LabourModel;
import com.example.ConstructionManagementSystem.model.LandAndHouseBuilderModel;
import com.example.ConstructionManagementSystem.model.LandSellerModel;
import com.example.ConstructionManagementSystem.model.ManagerModel;
import com.example.ConstructionManagementSystem.model.OwnLandConstructionModel;
import com.example.ConstructionManagementSystem.model.RegistrationModel;
import com.example.ConstructionManagementSystem.service.FormService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {

	@Autowired
	private FormService service;
	
	@GetMapping("/managerForm")
	public String managerForm(Model model) {
		model.addAttribute("managerModel", new ManagerModel());
		return "roles/manager";
	}
	
	@PostMapping("/subManager")
	public String subManager(@ModelAttribute ManagerModel manager, Model model) {
		service.addData(manager);
			return "redirect:manager";
	}
	
	@GetMapping("/engineerForm")
	public String engineerForm(Model model) {
		model.addAttribute("engineerModel", new EngineerModel());
		return "roles/engineer";
	}
	
	@PostMapping("/subEngineer")
	public String subEngineer(@ModelAttribute EngineerModel engineer ,Model model) {
		service.addDataEngineer(engineer);
		return "redirect:engineer";
	}
	
	@GetMapping("/labourForm")
	public String labourForm(Model model) {
		model.addAttribute("labourModel", new LabourModel());
		return "roles/labour";
	}
	@PostMapping("/subLabour")
	public String subLabour(@ModelAttribute LabourModel labour, Model model) {
		service.addDataLabour(labour);
		return "redirect:labour";
	}	
	@GetMapping("/landSellerForm")
	public String landSellerForm(Model model) {
		model.addAttribute("landSellerModel", new LandSellerModel());
		return "roles/landSeller";
	}
	@PostMapping("/subLandSeller")
	public String subLandSeller(@ModelAttribute LandSellerModel landSeller, Model model) {
		service.addDataLandSeller(landSeller);
		return "redirect:landSeller";
	}
	
	@GetMapping("/ownLandConstructionForm")
	public String ownLandConstruction(Model model) {
		model.addAttribute("ownLandConstructionModel", new OwnLandConstructionModel());
		return "roles/ownLandConstruction";
	}
	@PostMapping("/subOwnLandConstruction")
	public String subOwnLandConstruction(@ModelAttribute OwnLandConstructionModel ownLandConstruction, Model model) {
		service.addDataOwnLandConstruction(ownLandConstruction);
		return "redirect:ownLandConstruction";
	}
	
	@GetMapping("/landAndHouseBuilderForm")
	public String landAndHouseBuilderForm(Model model) {
		model.addAttribute("landAndHouseBuilderModel", new LandAndHouseBuilderModel());
		return "roles/landAndHouseBuilder";
	}
	@PostMapping("/subLandAndHouseBuilder")
	public String LandAndHouseBuilder(@ModelAttribute LandAndHouseBuilderModel landAndHouseBuilder, Model model) {
		service.addDataLandAndHouseBuilder(landAndHouseBuilder);
		return "redirect:landAndHouseBuilder";
	}
	
	@GetMapping("/apartmentBuyersForm")
	public String apartmentBuyers(Model model) {
		model.addAttribute("apartmentBuyersModel", new ApartmentBuyersModel());
		return "roles/apartmentBuyers";
	}
	@PostMapping("/subApartmentBuyers")
	public String subApartmentBuyers(@ModelAttribute ApartmentBuyersModel apartmentBuyers, Model model){
		service.addDataApartmentBuyers(apartmentBuyers);
		return "redirect:apartmentBuyers";
	}
}
