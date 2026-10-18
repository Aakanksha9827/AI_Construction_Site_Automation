package com.example.ConstructionManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationModel {

	private String name;
	private String email;	
	private String password;
	private String confirmPassword;
	private String country;	
	private String phoneNumber;
	private String role;
}
