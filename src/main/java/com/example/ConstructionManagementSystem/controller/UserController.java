package com.example.ConstructionManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ConstructionManagementSystem.entity.User;
import com.example.ConstructionManagementSystem.model.LoginModel;
import com.example.ConstructionManagementSystem.model.RegistrationModel;
import com.example.ConstructionManagementSystem.service.UserService;
import com.example.ConstructionManagementSystem.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/openRegister")
	public String openRegister(Model model) {
		model.addAttribute("registrationModel", new RegistrationModel());
		return "register";
	}
	
	@PostMapping("/register")
	public String openLogin(@ModelAttribute RegistrationModel reg, Model model) {
		boolean success = service.regUser(reg);
		
		if(success) {
			return "redirect:/login";
		}
		else {
			return "register";
		}
	}
	@GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }
//	@PostMapping("/do")
//	public String doLogin(@ModelAttribute LoginModel log, Model model) {
////		boolean valid = service.validateUser(log);
//		
//		User user = service.getUserByEmailAndPassword(log.getEmail(),log.getPassword());
//		
//		if(user != null) {
//			switch(user.getRole()) {
//			case "Land Seller":
//				return "redirect:/landSellerForm";
//			case "Labour" :
//			    return "redirect:/labourForm";
//			case "Engineer" :
//				return "redirect:/engineerForm";
//			case "Manager" :
//				return "redirect:/managerForm";
//			case "Customer_BHK_Flat" :
//				return "redirect:/apartmentBuyersForm";
//			case "Customer_Building_House":
//				return "redirect:/ownLandConstructionForm";
//			case "Commercial_Project":
//				return "redirect:/landAndHouseBuilderForm";
//			default:
//				return "form";
//			}
//		}else {
//			return "login";
//		}
////		if(valid){
////			return "form";
////		}else {
////			return "login";
////		}
//  	}
	
	@PostMapping("/do")
	public String doLogin(@ModelAttribute LoginModel log, Model model) {

		// Check for ADMIN LOGIN first
	    if(log.getEmail().equals("admin@gmail.com") && log.getPassword().equals("admin123")) {
	        return "adminPanel";   // adminPanel.html page
	    }
	    User user = service.getUserByEmailAndPassword(log.getEmail(), log.getPassword());

	    
	    if(user != null) {
	        model.addAttribute("role", user.getRole());
	        model.addAttribute("user", user);
	        return "dashboard";   // go to common dashboard page
	    } else {
	        return "login";
	    }
	}

}
