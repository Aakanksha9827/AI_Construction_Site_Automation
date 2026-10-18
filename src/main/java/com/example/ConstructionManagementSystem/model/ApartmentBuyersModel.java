package com.example.ConstructionManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApartmentBuyersModel {

	private String name;
	private String email;
	private String mobileNum;
	private double landSize;
	private int BHK;
	private String location;
}
