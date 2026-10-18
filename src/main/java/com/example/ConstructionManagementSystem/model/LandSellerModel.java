package com.example.ConstructionManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LandSellerModel {

	private String name;
	private String email;
	private String mobileNum;
	private String landLocation;
	private double landSizeSQFoot;
	private double price;
	private String verificationDocs;
	private String RERA;
}
