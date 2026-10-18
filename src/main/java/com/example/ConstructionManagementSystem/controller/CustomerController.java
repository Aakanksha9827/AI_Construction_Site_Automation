package com.example.ConstructionManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ConstructionManagementSystem.entity.Appointment;
import com.example.ConstructionManagementSystem.model.CustomerDashboardModel;
import com.example.ConstructionManagementSystem.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
    // Step 1: Show customer type selection page
    @GetMapping("/customer/selectType")
    public String selectCustomerType(Model model) {
        model.addAttribute("customerDashboard", new CustomerDashboardModel());
        return "select-customer-type";
    }

    // Step 2: Submit selected customer type and show dashboard actions
    @PostMapping("/customer/dashboard")
    public String showCustomerDashboard(@ModelAttribute CustomerDashboardModel customerDashboard, Model model) {
        model.addAttribute("customerType", customerDashboard.getCustomerType());
        return "customer-dashboard";
    }

    // Step 3: Map each action button to a separate page
    @GetMapping("/customer/viewApartments")
    public String viewApartments() {
        return "view-apartments"; // Thymeleaf page to show available apartments
    }

    @GetMapping("/customer/search")
    public String searchByLocationOrPrice() {
        return "search"; // Search page
    }

    @GetMapping("/customer/bookAppointment")
    public String bookAppointment(Model model) {
        model.addAttribute("appointment", new Appointment()); // matches th:object in form
        return "bookAppointment"; // Thymeleaf page
    }

 // Handle form submission via service
    @PostMapping("/customer/bookAppointment")
    public String submitAppointment(@ModelAttribute("appointment") Appointment appointment, Model model) {
    	service.saveAppointment(appointment); // save via service
        model.addAttribute("message", "Appointment booked successfully!");
        model.addAttribute("appointment", new Appointment()); // reset form
        return "bookAppointment";
    }

    @GetMapping("/customer/makePayment")
    public String makePaymentAndBooking() {
        return "make-payment";
    }

    @GetMapping("/customer/chat")
    public String chatWithSellerOrManager() {
        return "chat";
    }

    @GetMapping("/customer/trackBooking")
    public String trackBookingStatus() {
        return "track-booking";
    }

    @GetMapping("/customer/interiorDesign")
    public String interiorDesign() {
        return "interior-design";
    }
}
